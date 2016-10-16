package club.fcim.usedbooktrade.dbutil;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class DBUtil {

	public static enum DataSourceEnvironment {
		usedbook
	}

	private static Logger logger = LoggerFactory.getLogger(DBUtil.class);
	private final String config_path = "DataMapConfig.xml";
	private HashMap<DataSourceEnvironment, SqlSessionFactory> sqlSessionFactorys = new HashMap<DataSourceEnvironment, SqlSessionFactory>();
	
	
	public DBUtil() {

		Reader reader = null;
		try {
			for (DataSourceEnvironment dsv : DataSourceEnvironment.values()) {
				reader = Resources.getResourceAsReader(config_path);
				logger.debug("Initializing Datasource {}", dsv.name());
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(reader, dsv.name());
				sqlSessionFactorys.put(dsv, sqlSessionFactory);
				reader.close();
			}
		} catch (IOException e) {
			logger.debug("Exception while building SqlMapClient instance: {} ",
					e.getMessage());
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				logger.debug("Exception while closing Reading: {} ",
						e.getMessage());
			}
		}
	}

	public SqlSessionFactory getSqlSessionFactory(DataSourceEnvironment dsv) {
		return sqlSessionFactorys.get(dsv);
	}
}
