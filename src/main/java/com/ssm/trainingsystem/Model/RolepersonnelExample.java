package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class RolepersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolepersonnelExample() {
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

        public Criteria andRolepersonnelidIsNull() {
            addCriterion("rolepersonnelId is null");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidIsNotNull() {
            addCriterion("rolepersonnelId is not null");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidEqualTo(Integer value) {
            addCriterion("rolepersonnelId =", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidNotEqualTo(Integer value) {
            addCriterion("rolepersonnelId <>", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidGreaterThan(Integer value) {
            addCriterion("rolepersonnelId >", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolepersonnelId >=", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidLessThan(Integer value) {
            addCriterion("rolepersonnelId <", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("rolepersonnelId <=", value, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidIn(List<Integer> values) {
            addCriterion("rolepersonnelId in", values, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidNotIn(List<Integer> values) {
            addCriterion("rolepersonnelId not in", values, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("rolepersonnelId between", value1, value2, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRolepersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("rolepersonnelId not between", value1, value2, "rolepersonnelid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelId is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(Integer value) {
            addCriterion("personnelId =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(Integer value) {
            addCriterion("personnelId <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(Integer value) {
            addCriterion("personnelId >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelId >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(Integer value) {
            addCriterion("personnelId <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("personnelId <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<Integer> values) {
            addCriterion("personnelId in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<Integer> values) {
            addCriterion("personnelId not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("personnelId between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelId not between", value1, value2, "personnelid");
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