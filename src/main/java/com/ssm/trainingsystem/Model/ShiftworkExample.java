package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShiftworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShiftworkExample() {
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

        public Criteria andShiftworkidIsNull() {
            addCriterion("shiftworkid is null");
            return (Criteria) this;
        }

        public Criteria andShiftworkidIsNotNull() {
            addCriterion("shiftworkid is not null");
            return (Criteria) this;
        }

        public Criteria andShiftworkidEqualTo(Integer value) {
            addCriterion("shiftworkid =", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidNotEqualTo(Integer value) {
            addCriterion("shiftworkid <>", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidGreaterThan(Integer value) {
            addCriterion("shiftworkid >", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shiftworkid >=", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidLessThan(Integer value) {
            addCriterion("shiftworkid <", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidLessThanOrEqualTo(Integer value) {
            addCriterion("shiftworkid <=", value, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidIn(List<Integer> values) {
            addCriterion("shiftworkid in", values, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidNotIn(List<Integer> values) {
            addCriterion("shiftworkid not in", values, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidBetween(Integer value1, Integer value2) {
            addCriterion("shiftworkid between", value1, value2, "shiftworkid");
            return (Criteria) this;
        }

        public Criteria andShiftworkidNotBetween(Integer value1, Integer value2) {
            addCriterion("shiftworkid not between", value1, value2, "shiftworkid");
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

        public Criteria andShiftdateIsNull() {
            addCriterion("shiftdate is null");
            return (Criteria) this;
        }

        public Criteria andShiftdateIsNotNull() {
            addCriterion("shiftdate is not null");
            return (Criteria) this;
        }

        public Criteria andShiftdateEqualTo(Date value) {
            addCriterion("shiftdate =", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateNotEqualTo(Date value) {
            addCriterion("shiftdate <>", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateGreaterThan(Date value) {
            addCriterion("shiftdate >", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateGreaterThanOrEqualTo(Date value) {
            addCriterion("shiftdate >=", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateLessThan(Date value) {
            addCriterion("shiftdate <", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateLessThanOrEqualTo(Date value) {
            addCriterion("shiftdate <=", value, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateIn(List<Date> values) {
            addCriterion("shiftdate in", values, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateNotIn(List<Date> values) {
            addCriterion("shiftdate not in", values, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateBetween(Date value1, Date value2) {
            addCriterion("shiftdate between", value1, value2, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andShiftdateNotBetween(Date value1, Date value2) {
            addCriterion("shiftdate not between", value1, value2, "shiftdate");
            return (Criteria) this;
        }

        public Criteria andCurrentclassIsNull() {
            addCriterion("currentclass is null");
            return (Criteria) this;
        }

        public Criteria andCurrentclassIsNotNull() {
            addCriterion("currentclass is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentclassEqualTo(String value) {
            addCriterion("currentclass =", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassNotEqualTo(String value) {
            addCriterion("currentclass <>", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassGreaterThan(String value) {
            addCriterion("currentclass >", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassGreaterThanOrEqualTo(String value) {
            addCriterion("currentclass >=", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassLessThan(String value) {
            addCriterion("currentclass <", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassLessThanOrEqualTo(String value) {
            addCriterion("currentclass <=", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassLike(String value) {
            addCriterion("currentclass like", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassNotLike(String value) {
            addCriterion("currentclass not like", value, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassIn(List<String> values) {
            addCriterion("currentclass in", values, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassNotIn(List<String> values) {
            addCriterion("currentclass not in", values, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassBetween(String value1, String value2) {
            addCriterion("currentclass between", value1, value2, "currentclass");
            return (Criteria) this;
        }

        public Criteria andCurrentclassNotBetween(String value1, String value2) {
            addCriterion("currentclass not between", value1, value2, "currentclass");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftIsNull() {
            addCriterion("classaftershift is null");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftIsNotNull() {
            addCriterion("classaftershift is not null");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftEqualTo(String value) {
            addCriterion("classaftershift =", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftNotEqualTo(String value) {
            addCriterion("classaftershift <>", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftGreaterThan(String value) {
            addCriterion("classaftershift >", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftGreaterThanOrEqualTo(String value) {
            addCriterion("classaftershift >=", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftLessThan(String value) {
            addCriterion("classaftershift <", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftLessThanOrEqualTo(String value) {
            addCriterion("classaftershift <=", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftLike(String value) {
            addCriterion("classaftershift like", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftNotLike(String value) {
            addCriterion("classaftershift not like", value, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftIn(List<String> values) {
            addCriterion("classaftershift in", values, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftNotIn(List<String> values) {
            addCriterion("classaftershift not in", values, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftBetween(String value1, String value2) {
            addCriterion("classaftershift between", value1, value2, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andClassaftershiftNotBetween(String value1, String value2) {
            addCriterion("classaftershift not between", value1, value2, "classaftershift");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksIsNull() {
            addCriterion("shiftworkremarks is null");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksIsNotNull() {
            addCriterion("shiftworkremarks is not null");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksEqualTo(String value) {
            addCriterion("shiftworkremarks =", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksNotEqualTo(String value) {
            addCriterion("shiftworkremarks <>", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksGreaterThan(String value) {
            addCriterion("shiftworkremarks >", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksGreaterThanOrEqualTo(String value) {
            addCriterion("shiftworkremarks >=", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksLessThan(String value) {
            addCriterion("shiftworkremarks <", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksLessThanOrEqualTo(String value) {
            addCriterion("shiftworkremarks <=", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksLike(String value) {
            addCriterion("shiftworkremarks like", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksNotLike(String value) {
            addCriterion("shiftworkremarks not like", value, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksIn(List<String> values) {
            addCriterion("shiftworkremarks in", values, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksNotIn(List<String> values) {
            addCriterion("shiftworkremarks not in", values, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksBetween(String value1, String value2) {
            addCriterion("shiftworkremarks between", value1, value2, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andShiftworkremarksNotBetween(String value1, String value2) {
            addCriterion("shiftworkremarks not between", value1, value2, "shiftworkremarks");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("enclosure is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("enclosure =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("enclosure <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("enclosure >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("enclosure <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("enclosure <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("enclosure like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("enclosure not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("enclosure in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("enclosure not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("enclosure between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("enclosure not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeIsNull() {
            addCriterion("remainingtime is null");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeIsNotNull() {
            addCriterion("remainingtime is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeEqualTo(Date value) {
            addCriterion("remainingtime =", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeNotEqualTo(Date value) {
            addCriterion("remainingtime <>", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeGreaterThan(Date value) {
            addCriterion("remainingtime >", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remainingtime >=", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeLessThan(Date value) {
            addCriterion("remainingtime <", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeLessThanOrEqualTo(Date value) {
            addCriterion("remainingtime <=", value, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeIn(List<Date> values) {
            addCriterion("remainingtime in", values, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeNotIn(List<Date> values) {
            addCriterion("remainingtime not in", values, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeBetween(Date value1, Date value2) {
            addCriterion("remainingtime between", value1, value2, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andRemainingtimeNotBetween(Date value1, Date value2) {
            addCriterion("remainingtime not between", value1, value2, "remainingtime");
            return (Criteria) this;
        }

        public Criteria andIssendemailIsNull() {
            addCriterion("issendemail is null");
            return (Criteria) this;
        }

        public Criteria andIssendemailIsNotNull() {
            addCriterion("issendemail is not null");
            return (Criteria) this;
        }

        public Criteria andIssendemailEqualTo(String value) {
            addCriterion("issendemail =", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotEqualTo(String value) {
            addCriterion("issendemail <>", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailGreaterThan(String value) {
            addCriterion("issendemail >", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailGreaterThanOrEqualTo(String value) {
            addCriterion("issendemail >=", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailLessThan(String value) {
            addCriterion("issendemail <", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailLessThanOrEqualTo(String value) {
            addCriterion("issendemail <=", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailLike(String value) {
            addCriterion("issendemail like", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotLike(String value) {
            addCriterion("issendemail not like", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailIn(List<String> values) {
            addCriterion("issendemail in", values, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotIn(List<String> values) {
            addCriterion("issendemail not in", values, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailBetween(String value1, String value2) {
            addCriterion("issendemail between", value1, value2, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotBetween(String value1, String value2) {
            addCriterion("issendemail not between", value1, value2, "issendemail");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridIsNull() {
            addCriterion("createpersonnerid is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridIsNotNull() {
            addCriterion("createpersonnerid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridEqualTo(Integer value) {
            addCriterion("createpersonnerid =", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridNotEqualTo(Integer value) {
            addCriterion("createpersonnerid <>", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridGreaterThan(Integer value) {
            addCriterion("createpersonnerid >", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createpersonnerid >=", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridLessThan(Integer value) {
            addCriterion("createpersonnerid <", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridLessThanOrEqualTo(Integer value) {
            addCriterion("createpersonnerid <=", value, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridIn(List<Integer> values) {
            addCriterion("createpersonnerid in", values, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridNotIn(List<Integer> values) {
            addCriterion("createpersonnerid not in", values, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridBetween(Integer value1, Integer value2) {
            addCriterion("createpersonnerid between", value1, value2, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andCreatepersonneridNotBetween(Integer value1, Integer value2) {
            addCriterion("createpersonnerid not between", value1, value2, "createpersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridIsNull() {
            addCriterion("updatepersonnerid is null");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridIsNotNull() {
            addCriterion("updatepersonnerid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridEqualTo(Integer value) {
            addCriterion("updatepersonnerid =", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridNotEqualTo(Integer value) {
            addCriterion("updatepersonnerid <>", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridGreaterThan(Integer value) {
            addCriterion("updatepersonnerid >", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatepersonnerid >=", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridLessThan(Integer value) {
            addCriterion("updatepersonnerid <", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridLessThanOrEqualTo(Integer value) {
            addCriterion("updatepersonnerid <=", value, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridIn(List<Integer> values) {
            addCriterion("updatepersonnerid in", values, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridNotIn(List<Integer> values) {
            addCriterion("updatepersonnerid not in", values, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridBetween(Integer value1, Integer value2) {
            addCriterion("updatepersonnerid between", value1, value2, "updatepersonnerid");
            return (Criteria) this;
        }

        public Criteria andUpdatepersonneridNotBetween(Integer value1, Integer value2) {
            addCriterion("updatepersonnerid not between", value1, value2, "updatepersonnerid");
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