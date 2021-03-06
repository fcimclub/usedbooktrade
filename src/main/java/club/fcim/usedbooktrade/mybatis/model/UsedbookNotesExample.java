package club.fcim.usedbooktrade.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsedbookNotesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public UsedbookNotesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andGradeIsNull() {
			addCriterion("grade is null");
			return (Criteria) this;
		}

		public Criteria andGradeIsNotNull() {
			addCriterion("grade is not null");
			return (Criteria) this;
		}

		public Criteria andGradeEqualTo(String value) {
			addCriterion("grade =", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotEqualTo(String value) {
			addCriterion("grade <>", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThan(String value) {
			addCriterion("grade >", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThanOrEqualTo(String value) {
			addCriterion("grade >=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThan(String value) {
			addCriterion("grade <", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThanOrEqualTo(String value) {
			addCriterion("grade <=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLike(String value) {
			addCriterion("grade like", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotLike(String value) {
			addCriterion("grade not like", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeIn(List<String> values) {
			addCriterion("grade in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotIn(List<String> values) {
			addCriterion("grade not in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeBetween(String value1, String value2) {
			addCriterion("grade between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotBetween(String value1, String value2) {
			addCriterion("grade not between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNull() {
			addCriterion("school is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNotNull() {
			addCriterion("school is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolEqualTo(String value) {
			addCriterion("school =", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotEqualTo(String value) {
			addCriterion("school <>", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThan(String value) {
			addCriterion("school >", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThanOrEqualTo(String value) {
			addCriterion("school >=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThan(String value) {
			addCriterion("school <", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThanOrEqualTo(String value) {
			addCriterion("school <=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLike(String value) {
			addCriterion("school like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotLike(String value) {
			addCriterion("school not like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolIn(List<String> values) {
			addCriterion("school in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotIn(List<String> values) {
			addCriterion("school not in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolBetween(String value1, String value2) {
			addCriterion("school between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotBetween(String value1, String value2) {
			addCriterion("school not between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andContactIsNull() {
			addCriterion("contact is null");
			return (Criteria) this;
		}

		public Criteria andContactIsNotNull() {
			addCriterion("contact is not null");
			return (Criteria) this;
		}

		public Criteria andContactEqualTo(String value) {
			addCriterion("contact =", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotEqualTo(String value) {
			addCriterion("contact <>", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThan(String value) {
			addCriterion("contact >", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactGreaterThanOrEqualTo(String value) {
			addCriterion("contact >=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThan(String value) {
			addCriterion("contact <", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLessThanOrEqualTo(String value) {
			addCriterion("contact <=", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactLike(String value) {
			addCriterion("contact like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotLike(String value) {
			addCriterion("contact not like", value, "contact");
			return (Criteria) this;
		}

		public Criteria andContactIn(List<String> values) {
			addCriterion("contact in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotIn(List<String> values) {
			addCriterion("contact not in", values, "contact");
			return (Criteria) this;
		}

		public Criteria andContactBetween(String value1, String value2) {
			addCriterion("contact between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andContactNotBetween(String value1, String value2) {
			addCriterion("contact not between", value1, value2, "contact");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("updatetime is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("updatetime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Date value) {
			addCriterionForJDBCDate("updatetime =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("updatetime <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Date value) {
			addCriterionForJDBCDate("updatetime >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("updatetime >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Date value) {
			addCriterionForJDBCDate("updatetime <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("updatetime <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Date> values) {
			addCriterionForJDBCDate("updatetime in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("updatetime not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("updatetime between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("updatetime not between", value1, value2, "updatetime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table usedbook_notes
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 01 22:23:33 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}