package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andNamepaperIsNull() {
            addCriterion("namePaper is null");
            return (Criteria) this;
        }

        public Criteria andNamepaperIsNotNull() {
            addCriterion("namePaper is not null");
            return (Criteria) this;
        }

        public Criteria andNamepaperEqualTo(String value) {
            addCriterion("namePaper =", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotEqualTo(String value) {
            addCriterion("namePaper <>", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperGreaterThan(String value) {
            addCriterion("namePaper >", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperGreaterThanOrEqualTo(String value) {
            addCriterion("namePaper >=", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLessThan(String value) {
            addCriterion("namePaper <", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLessThanOrEqualTo(String value) {
            addCriterion("namePaper <=", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperLike(String value) {
            addCriterion("namePaper like", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotLike(String value) {
            addCriterion("namePaper not like", value, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperIn(List<String> values) {
            addCriterion("namePaper in", values, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotIn(List<String> values) {
            addCriterion("namePaper not in", values, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperBetween(String value1, String value2) {
            addCriterion("namePaper between", value1, value2, "namepaper");
            return (Criteria) this;
        }

        public Criteria andNamepaperNotBetween(String value1, String value2) {
            addCriterion("namePaper not between", value1, value2, "namepaper");
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

        public Criteria andIsqualifiedIsNull() {
            addCriterion("isqualified is null");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedIsNotNull() {
            addCriterion("isqualified is not null");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedEqualTo(String value) {
            addCriterion("isqualified =", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotEqualTo(String value) {
            addCriterion("isqualified <>", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedGreaterThan(String value) {
            addCriterion("isqualified >", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedGreaterThanOrEqualTo(String value) {
            addCriterion("isqualified >=", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedLessThan(String value) {
            addCriterion("isqualified <", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedLessThanOrEqualTo(String value) {
            addCriterion("isqualified <=", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedLike(String value) {
            addCriterion("isqualified like", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotLike(String value) {
            addCriterion("isqualified not like", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedIn(List<String> values) {
            addCriterion("isqualified in", values, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotIn(List<String> values) {
            addCriterion("isqualified not in", values, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedBetween(String value1, String value2) {
            addCriterion("isqualified between", value1, value2, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotBetween(String value1, String value2) {
            addCriterion("isqualified not between", value1, value2, "isqualified");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("begindate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("begindate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("begindate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("begindate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("begindate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("begindate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("begindate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("begindate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("begindate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("begindate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("begindate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("begindate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
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

        public Criteria andEnddateofmarkingIsNull() {
            addCriterion("enddateofmarking is null");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingIsNotNull() {
            addCriterion("enddateofmarking is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingEqualTo(Date value) {
            addCriterion("enddateofmarking =", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingNotEqualTo(Date value) {
            addCriterion("enddateofmarking <>", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingGreaterThan(Date value) {
            addCriterion("enddateofmarking >", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingGreaterThanOrEqualTo(Date value) {
            addCriterion("enddateofmarking >=", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingLessThan(Date value) {
            addCriterion("enddateofmarking <", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingLessThanOrEqualTo(Date value) {
            addCriterion("enddateofmarking <=", value, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingIn(List<Date> values) {
            addCriterion("enddateofmarking in", values, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingNotIn(List<Date> values) {
            addCriterion("enddateofmarking not in", values, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingBetween(Date value1, Date value2) {
            addCriterion("enddateofmarking between", value1, value2, "enddateofmarking");
            return (Criteria) this;
        }

        public Criteria andEnddateofmarkingNotBetween(Date value1, Date value2) {
            addCriterion("enddateofmarking not between", value1, value2, "enddateofmarking");
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

        public Criteria andIssubmitIsNull() {
            addCriterion("issubmit is null");
            return (Criteria) this;
        }

        public Criteria andIssubmitIsNotNull() {
            addCriterion("issubmit is not null");
            return (Criteria) this;
        }

        public Criteria andIssubmitEqualTo(String value) {
            addCriterion("issubmit =", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitNotEqualTo(String value) {
            addCriterion("issubmit <>", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitGreaterThan(String value) {
            addCriterion("issubmit >", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitGreaterThanOrEqualTo(String value) {
            addCriterion("issubmit >=", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitLessThan(String value) {
            addCriterion("issubmit <", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitLessThanOrEqualTo(String value) {
            addCriterion("issubmit <=", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitLike(String value) {
            addCriterion("issubmit like", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitNotLike(String value) {
            addCriterion("issubmit not like", value, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitIn(List<String> values) {
            addCriterion("issubmit in", values, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitNotIn(List<String> values) {
            addCriterion("issubmit not in", values, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitBetween(String value1, String value2) {
            addCriterion("issubmit between", value1, value2, "issubmit");
            return (Criteria) this;
        }

        public Criteria andIssubmitNotBetween(String value1, String value2) {
            addCriterion("issubmit not between", value1, value2, "issubmit");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("submitdate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("submitdate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterion("submitdate =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterion("submitdate <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterion("submitdate >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("submitdate >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterion("submitdate <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterion("submitdate <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterion("submitdate in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterion("submitdate not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterion("submitdate between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterion("submitdate not between", value1, value2, "submitdate");
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