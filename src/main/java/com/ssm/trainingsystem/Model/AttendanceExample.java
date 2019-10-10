package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAttendanceidIsNull() {
            addCriterion("AttendanceID is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceidIsNotNull() {
            addCriterion("AttendanceID is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceidEqualTo(Integer value) {
            addCriterion("AttendanceID =", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidNotEqualTo(Integer value) {
            addCriterion("AttendanceID <>", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidGreaterThan(Integer value) {
            addCriterion("AttendanceID >", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AttendanceID >=", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidLessThan(Integer value) {
            addCriterion("AttendanceID <", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidLessThanOrEqualTo(Integer value) {
            addCriterion("AttendanceID <=", value, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidIn(List<Integer> values) {
            addCriterion("AttendanceID in", values, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidNotIn(List<Integer> values) {
            addCriterion("AttendanceID not in", values, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidBetween(Integer value1, Integer value2) {
            addCriterion("AttendanceID between", value1, value2, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendanceidNotBetween(Integer value1, Integer value2) {
            addCriterion("AttendanceID not between", value1, value2, "attendanceid");
            return (Criteria) this;
        }

        public Criteria andAttendancedateIsNull() {
            addCriterion("AttendanceDate is null");
            return (Criteria) this;
        }

        public Criteria andAttendancedateIsNotNull() {
            addCriterion("AttendanceDate is not null");
            return (Criteria) this;
        }

        public Criteria andAttendancedateEqualTo(Date value) {
            addCriterionForJDBCDate("AttendanceDate =", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AttendanceDate <>", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateGreaterThan(Date value) {
            addCriterionForJDBCDate("AttendanceDate >", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AttendanceDate >=", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateLessThan(Date value) {
            addCriterionForJDBCDate("AttendanceDate <", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AttendanceDate <=", value, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateIn(List<Date> values) {
            addCriterionForJDBCDate("AttendanceDate in", values, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AttendanceDate not in", values, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AttendanceDate between", value1, value2, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andAttendancedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AttendanceDate not between", value1, value2, "attendancedate");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("PersonnelId is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("PersonnelId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(Integer value) {
            addCriterion("PersonnelId =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(Integer value) {
            addCriterion("PersonnelId <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(Integer value) {
            addCriterion("PersonnelId >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PersonnelId >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(Integer value) {
            addCriterion("PersonnelId <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("PersonnelId <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<Integer> values) {
            addCriterion("PersonnelId in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<Integer> values) {
            addCriterion("PersonnelId not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("PersonnelId between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("PersonnelId not between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andAttendancestateIsNull() {
            addCriterion("AttendanceState is null");
            return (Criteria) this;
        }

        public Criteria andAttendancestateIsNotNull() {
            addCriterion("AttendanceState is not null");
            return (Criteria) this;
        }

        public Criteria andAttendancestateEqualTo(String value) {
            addCriterion("AttendanceState =", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateNotEqualTo(String value) {
            addCriterion("AttendanceState <>", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateGreaterThan(String value) {
            addCriterion("AttendanceState >", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateGreaterThanOrEqualTo(String value) {
            addCriterion("AttendanceState >=", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateLessThan(String value) {
            addCriterion("AttendanceState <", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateLessThanOrEqualTo(String value) {
            addCriterion("AttendanceState <=", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateLike(String value) {
            addCriterion("AttendanceState like", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateNotLike(String value) {
            addCriterion("AttendanceState not like", value, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateIn(List<String> values) {
            addCriterion("AttendanceState in", values, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateNotIn(List<String> values) {
            addCriterion("AttendanceState not in", values, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateBetween(String value1, String value2) {
            addCriterion("AttendanceState between", value1, value2, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andAttendancestateNotBetween(String value1, String value2) {
            addCriterion("AttendanceState not between", value1, value2, "attendancestate");
            return (Criteria) this;
        }

        public Criteria andIsremindIsNull() {
            addCriterion("IsRemind is null");
            return (Criteria) this;
        }

        public Criteria andIsremindIsNotNull() {
            addCriterion("IsRemind is not null");
            return (Criteria) this;
        }

        public Criteria andIsremindEqualTo(String value) {
            addCriterion("IsRemind =", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotEqualTo(String value) {
            addCriterion("IsRemind <>", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindGreaterThan(String value) {
            addCriterion("IsRemind >", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindGreaterThanOrEqualTo(String value) {
            addCriterion("IsRemind >=", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindLessThan(String value) {
            addCriterion("IsRemind <", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindLessThanOrEqualTo(String value) {
            addCriterion("IsRemind <=", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindLike(String value) {
            addCriterion("IsRemind like", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotLike(String value) {
            addCriterion("IsRemind not like", value, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindIn(List<String> values) {
            addCriterion("IsRemind in", values, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotIn(List<String> values) {
            addCriterion("IsRemind not in", values, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindBetween(String value1, String value2) {
            addCriterion("IsRemind between", value1, value2, "isremind");
            return (Criteria) this;
        }

        public Criteria andIsremindNotBetween(String value1, String value2) {
            addCriterion("IsRemind not between", value1, value2, "isremind");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}