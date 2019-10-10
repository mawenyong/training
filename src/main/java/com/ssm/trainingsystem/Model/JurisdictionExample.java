package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class JurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JurisdictionExample() {
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

        public Criteria andJurisdictionidIsNull() {
            addCriterion("jurisdictionid is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNotNull() {
            addCriterion("jurisdictionid is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidEqualTo(Integer value) {
            addCriterion("jurisdictionid =", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotEqualTo(Integer value) {
            addCriterion("jurisdictionid <>", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThan(Integer value) {
            addCriterion("jurisdictionid >", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionid >=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThan(Integer value) {
            addCriterion("jurisdictionid <", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionid <=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIn(List<Integer> values) {
            addCriterion("jurisdictionid in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotIn(List<Integer> values) {
            addCriterion("jurisdictionid not in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionid between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionid not between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNull() {
            addCriterion("interfacename is null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNotNull() {
            addCriterion("interfacename is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameEqualTo(String value) {
            addCriterion("interfacename =", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotEqualTo(String value) {
            addCriterion("interfacename <>", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThan(String value) {
            addCriterion("interfacename >", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThanOrEqualTo(String value) {
            addCriterion("interfacename >=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThan(String value) {
            addCriterion("interfacename <", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThanOrEqualTo(String value) {
            addCriterion("interfacename <=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLike(String value) {
            addCriterion("interfacename like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotLike(String value) {
            addCriterion("interfacename not like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIn(List<String> values) {
            addCriterion("interfacename in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotIn(List<String> values) {
            addCriterion("interfacename not in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameBetween(String value1, String value2) {
            addCriterion("interfacename between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotBetween(String value1, String value2) {
            addCriterion("interfacename not between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andModelnameIsNull() {
            addCriterion("modelname is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("modelname is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("modelname =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("modelname <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("modelname >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("modelname >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("modelname <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("modelname <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("modelname like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("modelname not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("modelname in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("modelname not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("modelname between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("modelname not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidIsNull() {
            addCriterion("parentjurisdictionid is null");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidIsNotNull() {
            addCriterion("parentjurisdictionid is not null");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidEqualTo(Integer value) {
            addCriterion("parentjurisdictionid =", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidNotEqualTo(Integer value) {
            addCriterion("parentjurisdictionid <>", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidGreaterThan(Integer value) {
            addCriterion("parentjurisdictionid >", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentjurisdictionid >=", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidLessThan(Integer value) {
            addCriterion("parentjurisdictionid <", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidLessThanOrEqualTo(Integer value) {
            addCriterion("parentjurisdictionid <=", value, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidIn(List<Integer> values) {
            addCriterion("parentjurisdictionid in", values, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidNotIn(List<Integer> values) {
            addCriterion("parentjurisdictionid not in", values, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidBetween(Integer value1, Integer value2) {
            addCriterion("parentjurisdictionid between", value1, value2, "parentjurisdictionid");
            return (Criteria) this;
        }

        public Criteria andParentjurisdictionidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentjurisdictionid not between", value1, value2, "parentjurisdictionid");
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