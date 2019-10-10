package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LeaveformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveformExample() {
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

        public Criteria andLeaveformidIsNull() {
            addCriterion("leaveformid is null");
            return (Criteria) this;
        }

        public Criteria andLeaveformidIsNotNull() {
            addCriterion("leaveformid is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveformidEqualTo(Integer value) {
            addCriterion("leaveformid =", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidNotEqualTo(Integer value) {
            addCriterion("leaveformid <>", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidGreaterThan(Integer value) {
            addCriterion("leaveformid >", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveformid >=", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidLessThan(Integer value) {
            addCriterion("leaveformid <", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidLessThanOrEqualTo(Integer value) {
            addCriterion("leaveformid <=", value, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidIn(List<Integer> values) {
            addCriterion("leaveformid in", values, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidNotIn(List<Integer> values) {
            addCriterion("leaveformid not in", values, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidBetween(Integer value1, Integer value2) {
            addCriterion("leaveformid between", value1, value2, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andLeaveformidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveformid not between", value1, value2, "leaveformid");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateIsNull() {
            addCriterion("leavebegindate is null");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateIsNotNull() {
            addCriterion("leavebegindate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateEqualTo(Date value) {
            addCriterionForJDBCDate("leavebegindate =", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leavebegindate <>", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("leavebegindate >", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leavebegindate >=", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateLessThan(Date value) {
            addCriterionForJDBCDate("leavebegindate <", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leavebegindate <=", value, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateIn(List<Date> values) {
            addCriterionForJDBCDate("leavebegindate in", values, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leavebegindate not in", values, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leavebegindate between", value1, value2, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeavebegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leavebegindate not between", value1, value2, "leavebegindate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateIsNull() {
            addCriterion("leaveenddate is null");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateIsNotNull() {
            addCriterion("leaveenddate is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateEqualTo(Date value) {
            addCriterionForJDBCDate("leaveenddate =", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leaveenddate <>", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("leaveenddate >", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveenddate >=", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateLessThan(Date value) {
            addCriterionForJDBCDate("leaveenddate <", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveenddate <=", value, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateIn(List<Date> values) {
            addCriterionForJDBCDate("leaveenddate in", values, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leaveenddate not in", values, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveenddate between", value1, value2, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andLeaveenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveenddate not between", value1, value2, "leaveenddate");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveIsNull() {
            addCriterion("reasonforleave is null");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveIsNotNull() {
            addCriterion("reasonforleave is not null");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveEqualTo(String value) {
            addCriterion("reasonforleave =", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveNotEqualTo(String value) {
            addCriterion("reasonforleave <>", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveGreaterThan(String value) {
            addCriterion("reasonforleave >", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveGreaterThanOrEqualTo(String value) {
            addCriterion("reasonforleave >=", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveLessThan(String value) {
            addCriterion("reasonforleave <", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveLessThanOrEqualTo(String value) {
            addCriterion("reasonforleave <=", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveLike(String value) {
            addCriterion("reasonforleave like", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveNotLike(String value) {
            addCriterion("reasonforleave not like", value, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveIn(List<String> values) {
            addCriterion("reasonforleave in", values, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveNotIn(List<String> values) {
            addCriterion("reasonforleave not in", values, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveBetween(String value1, String value2) {
            addCriterion("reasonforleave between", value1, value2, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andReasonforleaveNotBetween(String value1, String value2) {
            addCriterion("reasonforleave not between", value1, value2, "reasonforleave");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNull() {
            addCriterion("approvaldate is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("approvaldate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterionForJDBCDate("approvaldate =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approvaldate <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterionForJDBCDate("approvaldate >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approvaldate >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterionForJDBCDate("approvaldate <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approvaldate <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterionForJDBCDate("approvaldate in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approvaldate not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approvaldate between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approvaldate not between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(String value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(String value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(String value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(String value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(String value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(String value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLike(String value) {
            addCriterion("tno like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotLike(String value) {
            addCriterion("tno not like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<String> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<String> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(String value1, String value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(String value1, String value2) {
            addCriterion("tno not between", value1, value2, "tno");
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
            addCriterionForJDBCDate("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNull() {
            addCriterion("approvalstate is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNotNull() {
            addCriterion("approvalstate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateEqualTo(String value) {
            addCriterion("approvalstate =", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotEqualTo(String value) {
            addCriterion("approvalstate <>", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThan(String value) {
            addCriterion("approvalstate >", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThanOrEqualTo(String value) {
            addCriterion("approvalstate >=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThan(String value) {
            addCriterion("approvalstate <", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThanOrEqualTo(String value) {
            addCriterion("approvalstate <=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLike(String value) {
            addCriterion("approvalstate like", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotLike(String value) {
            addCriterion("approvalstate not like", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIn(List<String> values) {
            addCriterion("approvalstate in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotIn(List<String> values) {
            addCriterion("approvalstate not in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateBetween(String value1, String value2) {
            addCriterion("approvalstate between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotBetween(String value1, String value2) {
            addCriterion("approvalstate not between", value1, value2, "approvalstate");
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