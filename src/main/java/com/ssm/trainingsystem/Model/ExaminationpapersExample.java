package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class ExaminationpapersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationpapersExample() {
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

        public Criteria andExaminationpapersidIsNull() {
            addCriterion("examinationpapersid is null");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidIsNotNull() {
            addCriterion("examinationpapersid is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidEqualTo(Integer value) {
            addCriterion("examinationpapersid =", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidNotEqualTo(Integer value) {
            addCriterion("examinationpapersid <>", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidGreaterThan(Integer value) {
            addCriterion("examinationpapersid >", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("examinationpapersid >=", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidLessThan(Integer value) {
            addCriterion("examinationpapersid <", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidLessThanOrEqualTo(Integer value) {
            addCriterion("examinationpapersid <=", value, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidIn(List<Integer> values) {
            addCriterion("examinationpapersid in", values, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidNotIn(List<Integer> values) {
            addCriterion("examinationpapersid not in", values, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidBetween(Integer value1, Integer value2) {
            addCriterion("examinationpapersid between", value1, value2, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andExaminationpapersidNotBetween(Integer value1, Integer value2) {
            addCriterion("examinationpapersid not between", value1, value2, "examinationpapersid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidIsNull() {
            addCriterion("testpaperid is null");
            return (Criteria) this;
        }

        public Criteria andTestpaperidIsNotNull() {
            addCriterion("testpaperid is not null");
            return (Criteria) this;
        }

        public Criteria andTestpaperidEqualTo(Integer value) {
            addCriterion("testpaperid =", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidNotEqualTo(Integer value) {
            addCriterion("testpaperid <>", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidGreaterThan(Integer value) {
            addCriterion("testpaperid >", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testpaperid >=", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidLessThan(Integer value) {
            addCriterion("testpaperid <", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidLessThanOrEqualTo(Integer value) {
            addCriterion("testpaperid <=", value, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidIn(List<Integer> values) {
            addCriterion("testpaperid in", values, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidNotIn(List<Integer> values) {
            addCriterion("testpaperid not in", values, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidBetween(Integer value1, Integer value2) {
            addCriterion("testpaperid between", value1, value2, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andTestpaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("testpaperid not between", value1, value2, "testpaperid");
            return (Criteria) this;
        }

        public Criteria andItembankidIsNull() {
            addCriterion("itembankid is null");
            return (Criteria) this;
        }

        public Criteria andItembankidIsNotNull() {
            addCriterion("itembankid is not null");
            return (Criteria) this;
        }

        public Criteria andItembankidEqualTo(Integer value) {
            addCriterion("itembankid =", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidNotEqualTo(Integer value) {
            addCriterion("itembankid <>", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidGreaterThan(Integer value) {
            addCriterion("itembankid >", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itembankid >=", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidLessThan(Integer value) {
            addCriterion("itembankid <", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidLessThanOrEqualTo(Integer value) {
            addCriterion("itembankid <=", value, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidIn(List<Integer> values) {
            addCriterion("itembankid in", values, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidNotIn(List<Integer> values) {
            addCriterion("itembankid not in", values, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidBetween(Integer value1, Integer value2) {
            addCriterion("itembankid between", value1, value2, "itembankid");
            return (Criteria) this;
        }

        public Criteria andItembankidNotBetween(Integer value1, Integer value2) {
            addCriterion("itembankid not between", value1, value2, "itembankid");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNull() {
            addCriterion("sequencenumber is null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNotNull() {
            addCriterion("sequencenumber is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberEqualTo(String value) {
            addCriterion("sequencenumber =", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotEqualTo(String value) {
            addCriterion("sequencenumber <>", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThan(String value) {
            addCriterion("sequencenumber >", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThanOrEqualTo(String value) {
            addCriterion("sequencenumber >=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThan(String value) {
            addCriterion("sequencenumber <", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThanOrEqualTo(String value) {
            addCriterion("sequencenumber <=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLike(String value) {
            addCriterion("sequencenumber like", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotLike(String value) {
            addCriterion("sequencenumber not like", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIn(List<String> values) {
            addCriterion("sequencenumber in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotIn(List<String> values) {
            addCriterion("sequencenumber not in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberBetween(String value1, String value2) {
            addCriterion("sequencenumber between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotBetween(String value1, String value2) {
            addCriterion("sequencenumber not between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andTopictypesIsNull() {
            addCriterion("topictypes is null");
            return (Criteria) this;
        }

        public Criteria andTopictypesIsNotNull() {
            addCriterion("topictypes is not null");
            return (Criteria) this;
        }

        public Criteria andTopictypesEqualTo(String value) {
            addCriterion("topictypes =", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesNotEqualTo(String value) {
            addCriterion("topictypes <>", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesGreaterThan(String value) {
            addCriterion("topictypes >", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesGreaterThanOrEqualTo(String value) {
            addCriterion("topictypes >=", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesLessThan(String value) {
            addCriterion("topictypes <", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesLessThanOrEqualTo(String value) {
            addCriterion("topictypes <=", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesLike(String value) {
            addCriterion("topictypes like", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesNotLike(String value) {
            addCriterion("topictypes not like", value, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesIn(List<String> values) {
            addCriterion("topictypes in", values, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesNotIn(List<String> values) {
            addCriterion("topictypes not in", values, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesBetween(String value1, String value2) {
            addCriterion("topictypes between", value1, value2, "topictypes");
            return (Criteria) this;
        }

        public Criteria andTopictypesNotBetween(String value1, String value2) {
            addCriterion("topictypes not between", value1, value2, "topictypes");
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