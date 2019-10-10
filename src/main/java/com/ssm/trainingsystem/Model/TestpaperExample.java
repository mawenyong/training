package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestpaperExample() {
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

        public Criteria andNamepaperIsNull() {
            addCriterion("namepaper is null");
            return (Criteria) this;
        }

        public Criteria andNamepaperIsNotNull() {
            addCriterion("namepaper is not null");
            return (Criteria) this;
        }

        public Criteria andNamepaperEqualTo(String value) {
            addCriterion("namepaper =", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotEqualTo(String value) {
            addCriterion("namepaper <>", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperGreaterThan(String value) {
            addCriterion("namepaper >", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperGreaterThanOrEqualTo(String value) {
            addCriterion("namepaper >=", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLessThan(String value) {
            addCriterion("namepaper <", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLessThanOrEqualTo(String value) {
            addCriterion("namepaper <=", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLike(String value) {
            addCriterion("namepaper like", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotLike(String value) {
            addCriterion("namepaper not like", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperIn(List<String> values) {
            addCriterion("namepaper in", values, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotIn(List<String> values) {
            addCriterion("namepaper not in", values, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperBetween(String value1, String value2) {
            addCriterion("namepaper between", value1, value2, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotBetween(String value1, String value2) {
            addCriterion("namepaper not between", value1, value2, "namepaper");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(Integer value) {
            addCriterion("personnelid =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(Integer value) {
            addCriterion("personnelid <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(Integer value) {
            addCriterion("personnelid >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnelid >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(Integer value) {
            addCriterion("personnelid <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(Integer value) {
            addCriterion("personnelid <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<Integer> values) {
            addCriterion("personnelid in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<Integer> values) {
            addCriterion("personnelid not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(Integer value1, Integer value2) {
            addCriterion("personnelid between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(Integer value1, Integer value2) {
            addCriterion("personnelid not between", value1, value2, "personnelid");
            return (Criteria) this;
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releasedate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releasedate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterion("releasedate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterion("releasedate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterion("releasedate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("releasedate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterion("releasedate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("releasedate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterion("releasedate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterion("releasedate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterion("releasedate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("releasedate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andIsreleaseIsNull() {
            addCriterion("isrelease is null");
            return (Criteria) this;
        }

        public Criteria andIsreleaseIsNotNull() {
            addCriterion("isrelease is not null");
            return (Criteria) this;
        }

        public Criteria andIsreleaseEqualTo(String value) {
            addCriterion("isrelease =", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseNotEqualTo(String value) {
            addCriterion("isrelease <>", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseGreaterThan(String value) {
            addCriterion("isrelease >", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseGreaterThanOrEqualTo(String value) {
            addCriterion("isrelease >=", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseLessThan(String value) {
            addCriterion("isrelease <", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseLessThanOrEqualTo(String value) {
            addCriterion("isrelease <=", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseLike(String value) {
            addCriterion("isrelease like", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseNotLike(String value) {
            addCriterion("isrelease not like", value, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseIn(List<String> values) {
            addCriterion("isrelease in", values, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseNotIn(List<String> values) {
            addCriterion("isrelease not in", values, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseBetween(String value1, String value2) {
            addCriterion("isrelease between", value1, value2, "isrelease");
            return (Criteria) this;
        }

        public Criteria andIsreleaseNotBetween(String value1, String value2) {
            addCriterion("isrelease not between", value1, value2, "isrelease");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalscore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalscore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Integer value) {
            addCriterion("totalscore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Integer value) {
            addCriterion("totalscore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Integer value) {
            addCriterion("totalscore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalscore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Integer value) {
            addCriterion("totalscore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Integer value) {
            addCriterion("totalscore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Integer> values) {
            addCriterion("totalscore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Integer> values) {
            addCriterion("totalscore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Integer value1, Integer value2) {
            addCriterion("totalscore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("totalscore not between", value1, value2, "totalscore");
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