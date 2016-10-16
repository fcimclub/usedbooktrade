package club.fcim.usedbooktrade.dbutil;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import club.fcim.usedbooktrade.dbutil.DBUtil.DataSourceEnvironment;

public class DBAssist {
	private static Logger logger = LoggerFactory.getLogger(DBAssist.class);
	private final static ThreadLocal<SqlSession> sessionThread = new ThreadLocal<SqlSession>();
	private final static ThreadLocal<Transaction> transactionThread = new ThreadLocal<Transaction>();

	@Autowired
	DBUtil bd;

	private DataSourceEnvironment dsv;

	public DBAssist(DataSourceEnvironment _dsv) {
		dsv = _dsv;
	}

	/**
	 * 创建新的sqlSession
	 * 
	 * @return
	 * @throws SQLException
	 */
	private SqlSession createNewSqlSession(boolean needCommited) throws SQLException {
		logger.debug("prepare to open the new session with {}", dsv.name());
		SqlSession session = bd.getSqlSessionFactory(dsv).openSession();
		logger.debug("setting sqlsession in Thread.");
		setSessionInThread(session);
		return session;
	}

	public void closeSession(boolean needCommited) throws SQLException {
		logger.debug("closing sessions.");
		if (isSessionNotNull()) {
			if (needCommited)
				getSqlSession().commit();
			getSqlSession().close();
			sessionThread.remove();
		}
	}

	/**
	 * 存入LocalThread
	 * 
	 * @param session
	 */
	private void setSessionInThread(SqlSession session) {
		sessionThread.set(session);
	}

	/**
	 * 从LocalThread中获得sqlSession
	 * 
	 * @return
	 */
	private SqlSession getSqlSession() {
		return sessionThread.get();
	}

	/**
	 * 判断LocalThread中sqlSession是否为空
	 * 
	 * @return
	 */
	private boolean isSessionNotNull() {
		if (getSqlSession() == null)
			return false;
		return true;
	}

	public void startTransaction(boolean autoCommit) {
		this.setCurrentTransaction(autoCommit);
	}

	private Transaction setCurrentTransaction(boolean autoCommit) {
		// session为空，不需要transaction
		if (!isSessionNotNull())
			return null;
		// session不为空
		Transaction t = getCurrentTransaction();
		// 1. 已经有transaction
		if (t != null)
			return t;
		// 2. 没有transaction
		TransactionFactory factory = new JdbcTransactionFactory();
		t = factory.newTransaction(getSqlSession().getConnection());
		try {
			t.getConnection().setAutoCommit(autoCommit);
		} catch (SQLException e) {
			afterException("SetAutoCommit.error", e);
		}
		setTxInThread(t);
		return t;
	}

	public void rollback() throws SQLException {
		if (isTransactionNotNull()) {
			getCurrentTransaction().rollback();
		}
	}

	public void commitTransaction() throws SQLException {
		if (isTransactionNotNull()) {
			try {
				getCurrentTransaction().commit();
			} catch (SQLException e) {
				afterException("Commit Transaction.error", e);
				throw e.getNextException();
			}
		}
	}

	public void commitAndCloseSession() throws SQLException {
		try {
			commitTransaction();
			endTransaction();
		} catch (SQLException e) {
			throw e.getNextException();
		}
	}

	public void endTransaction() throws SQLException {
		// close session means close the transaction,so do not need to close
		// transaction
		closeSession(false);
		transactionThread.remove();
	}

	private void setTxInThread(Transaction tx) {
		transactionThread.set(tx);
	}

	private Transaction getCurrentTransaction() {
		Transaction transaction = transactionThread.get();
		return transaction;
	}

	private boolean isTransactionNotNull() {
		if (getCurrentTransaction() != null)
			return true;
		return false;
	}

	// XML Mapper
	public <T> T getMapper(Class<T> objectMapper, boolean newSession) {
		SqlSession sqlSession = null;
		T om = null;
		try {
			sqlSession = newSession ? this.createNewSqlSession(true) : this.getSqlSession();
			om = sqlSession.getMapper(objectMapper);
		} catch (Exception e) {
			afterException("getMapper", e);
		}
		return om;
	}

	private void afterException(String namespace, Exception e) {
		try {
			logger.error(namespace, e);
			rollback();
		} catch (SQLException e1) {
			logger.error("rollback", e1);
		}
	}

	private void isDuringTransaction() {
		if (transactionThread.get() == null) {
			try {
				closeSession(true);
			} catch (SQLException e) {
				afterException("isDuringTransaction", e);
			}
		}
	}

}
