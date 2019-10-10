package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class NumberclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NumberclassExample() {
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

        public Criteria andNumberclassidIsNull() {
            addCriterion("numberclassid is null");
            return (Criteria) this;
        }

        public Criteria andNumberclassidIsNotNull() {
            addCriterion("numberclassid is not null");
            return (Criteria) this;
        }

        public Criteria andNumberclassidEqualTo(Integer value) {
            addCriterion("numberclassid =", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidNotEqualTo(Integer value) {
            addCriterion("numberclassid <>", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidGreaterThan(Integer value) {
            addCriterion("numberclassid >", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberclassid >=", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidLessThan(Integer value) {
            addCriterion("numberclassid <", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidLessThanOrEqualTo(Integer value) {
            addCriterion("numberclassid <=", value, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidIn(List<Integer> values) {
            addCriterion("numberclassid in", values, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidNotIn(List<Integer> values) {
            addCriterion("numberclassid not in", values, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidBetween(Integer value1, Integer value2) {
            addCriterion("numberclassid between", value1, value2, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andNumberclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("numberclassid not between", value1, value2, "numberclassid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberIsNull() {
            addCriterion("classroomuumber is null");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberIsNotNull() {
            addCriterion("classroomuumber is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberEqualTo(String value) {
            addCriterion("classroomuumber =", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberNotEqualTo(String value) {
            addCriterion("classroomuumber <>", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberGreaterThan(String value) {
            addCriterion("classroomuumber >", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberGreaterThanOrEqualTo(String value) {
            addCriterion("classroomuumber >=", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberLessThan(String value) {
            addCriterion("classroomuumber <", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberLessThanOrEqualTo(String value) {
            addCriterion("classroomuumber <=", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberLike(String value) {
            addCriterion("classroomuumber like", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberNotLike(String value) {
            addCriterion("classroomuumber not like", value, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberIn(List<String> values) {
            addCriterion("classroomuumber in", values, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberNotIn(List<String> values) {
            addCriterion("classroomuumber not in", values, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberBetween(String value1, String value2) {
            addCriterion("classroomuumber between", value1, value2, "classroomuumber");
            return (Criteria) this;
        }

        public Criteria andClassroomuumberNotBetween(String value1, String value2) {
            addCriterion("classroomuumber not between", value1, value2, "classroomuumber");
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