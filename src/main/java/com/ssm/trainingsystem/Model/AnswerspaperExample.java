package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class AnswerspaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerspaperExample() {
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

        public Criteria andAnswerspaperidIsNull() {
            addCriterion("answerspaperid is null");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidIsNotNull() {
            addCriterion("answerspaperid is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidEqualTo(Integer value) {
            addCriterion("answerspaperid =", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidNotEqualTo(Integer value) {
            addCriterion("answerspaperid <>", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidGreaterThan(Integer value) {
            addCriterion("answerspaperid >", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerspaperid >=", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidLessThan(Integer value) {
            addCriterion("answerspaperid <", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidLessThanOrEqualTo(Integer value) {
            addCriterion("answerspaperid <=", value, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidIn(List<Integer> values) {
            addCriterion("answerspaperid in", values, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidNotIn(List<Integer> values) {
            addCriterion("answerspaperid not in", values, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidBetween(Integer value1, Integer value2) {
            addCriterion("answerspaperid between", value1, value2, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnswerspaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("answerspaperid not between", value1, value2, "answerspaperid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNull() {
            addCriterion("answerid is null");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNotNull() {
            addCriterion("answerid is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweridEqualTo(Integer value) {
            addCriterion("answerid =", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotEqualTo(Integer value) {
            addCriterion("answerid <>", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThan(Integer value) {
            addCriterion("answerid >", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerid >=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThan(Integer value) {
            addCriterion("answerid <", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThanOrEqualTo(Integer value) {
            addCriterion("answerid <=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIn(List<Integer> values) {
            addCriterion("answerid in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotIn(List<Integer> values) {
            addCriterion("answerid not in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridBetween(Integer value1, Integer value2) {
            addCriterion("answerid between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotBetween(Integer value1, Integer value2) {
            addCriterion("answerid not between", value1, value2, "answerid");
            return (Criteria) this;
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

        public Criteria andIscorrectIsNull() {
            addCriterion("iscorrect is null");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNotNull() {
            addCriterion("iscorrect is not null");
            return (Criteria) this;
        }

        public Criteria andIscorrectEqualTo(String value) {
            addCriterion("iscorrect =", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotEqualTo(String value) {
            addCriterion("iscorrect <>", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThan(String value) {
            addCriterion("iscorrect >", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThanOrEqualTo(String value) {
            addCriterion("iscorrect >=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThan(String value) {
            addCriterion("iscorrect <", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThanOrEqualTo(String value) {
            addCriterion("iscorrect <=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLike(String value) {
            addCriterion("iscorrect like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotLike(String value) {
            addCriterion("iscorrect not like", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectIn(List<String> values) {
            addCriterion("iscorrect in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotIn(List<String> values) {
            addCriterion("iscorrect not in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectBetween(String value1, String value2) {
            addCriterion("iscorrect between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotBetween(String value1, String value2) {
            addCriterion("iscorrect not between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsIsNull() {
            addCriterion("AnswerResults is null");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsIsNotNull() {
            addCriterion("AnswerResults is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsEqualTo(String value) {
            addCriterion("AnswerResults =", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsNotEqualTo(String value) {
            addCriterion("AnswerResults <>", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsGreaterThan(String value) {
            addCriterion("AnswerResults >", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerResults >=", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsLessThan(String value) {
            addCriterion("AnswerResults <", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsLessThanOrEqualTo(String value) {
            addCriterion("AnswerResults <=", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsLike(String value) {
            addCriterion("AnswerResults like", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsNotLike(String value) {
            addCriterion("AnswerResults not like", value, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsIn(List<String> values) {
            addCriterion("AnswerResults in", values, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsNotIn(List<String> values) {
            addCriterion("AnswerResults not in", values, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsBetween(String value1, String value2) {
            addCriterion("AnswerResults between", value1, value2, "answerresults");
            return (Criteria) this;
        }

        public Criteria andAnswerresultsNotBetween(String value1, String value2) {
            addCriterion("AnswerResults not between", value1, value2, "answerresults");
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