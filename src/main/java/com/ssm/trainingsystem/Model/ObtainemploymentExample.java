package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ObtainemploymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ObtainemploymentExample() {
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

        public Criteria andObtainemploymentidIsNull() {
            addCriterion("ObtainEmploymentID is null");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidIsNotNull() {
            addCriterion("ObtainEmploymentID is not null");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidEqualTo(Integer value) {
            addCriterion("ObtainEmploymentID =", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidNotEqualTo(Integer value) {
            addCriterion("ObtainEmploymentID <>", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidGreaterThan(Integer value) {
            addCriterion("ObtainEmploymentID >", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ObtainEmploymentID >=", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidLessThan(Integer value) {
            addCriterion("ObtainEmploymentID <", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidLessThanOrEqualTo(Integer value) {
            addCriterion("ObtainEmploymentID <=", value, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidIn(List<Integer> values) {
            addCriterion("ObtainEmploymentID in", values, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidNotIn(List<Integer> values) {
            addCriterion("ObtainEmploymentID not in", values, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidBetween(Integer value1, Integer value2) {
            addCriterion("ObtainEmploymentID between", value1, value2, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andObtainemploymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ObtainEmploymentID not between", value1, value2, "obtainemploymentid");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("Sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("Sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("Sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("Sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("Sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("Sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("Sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("Sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("Sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("Sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("Sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("Sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("Sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("Sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionIsNull() {
            addCriterion("EmploymentDirection is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionIsNotNull() {
            addCriterion("EmploymentDirection is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionEqualTo(String value) {
            addCriterion("EmploymentDirection =", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionNotEqualTo(String value) {
            addCriterion("EmploymentDirection <>", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionGreaterThan(String value) {
            addCriterion("EmploymentDirection >", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionGreaterThanOrEqualTo(String value) {
            addCriterion("EmploymentDirection >=", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionLessThan(String value) {
            addCriterion("EmploymentDirection <", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionLessThanOrEqualTo(String value) {
            addCriterion("EmploymentDirection <=", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionLike(String value) {
            addCriterion("EmploymentDirection like", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionNotLike(String value) {
            addCriterion("EmploymentDirection not like", value, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionIn(List<String> values) {
            addCriterion("EmploymentDirection in", values, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionNotIn(List<String> values) {
            addCriterion("EmploymentDirection not in", values, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionBetween(String value1, String value2) {
            addCriterion("EmploymentDirection between", value1, value2, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEmploymentdirectionNotBetween(String value1, String value2) {
            addCriterion("EmploymentDirection not between", value1, value2, "employmentdirection");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("Enclosure is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("Enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("Enclosure =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("Enclosure <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("Enclosure >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("Enclosure >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("Enclosure <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("Enclosure <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("Enclosure like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("Enclosure not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("Enclosure in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("Enclosure not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("Enclosure between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("Enclosure not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityIsNull() {
            addCriterion("EmploymentCity is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityIsNotNull() {
            addCriterion("EmploymentCity is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityEqualTo(String value) {
            addCriterion("EmploymentCity =", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityNotEqualTo(String value) {
            addCriterion("EmploymentCity <>", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityGreaterThan(String value) {
            addCriterion("EmploymentCity >", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityGreaterThanOrEqualTo(String value) {
            addCriterion("EmploymentCity >=", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityLessThan(String value) {
            addCriterion("EmploymentCity <", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityLessThanOrEqualTo(String value) {
            addCriterion("EmploymentCity <=", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityLike(String value) {
            addCriterion("EmploymentCity like", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityNotLike(String value) {
            addCriterion("EmploymentCity not like", value, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityIn(List<String> values) {
            addCriterion("EmploymentCity in", values, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityNotIn(List<String> values) {
            addCriterion("EmploymentCity not in", values, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityBetween(String value1, String value2) {
            addCriterion("EmploymentCity between", value1, value2, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentcityNotBetween(String value1, String value2) {
            addCriterion("EmploymentCity not between", value1, value2, "employmentcity");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateIsNull() {
            addCriterion("EmploymentDate is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateIsNotNull() {
            addCriterion("EmploymentDate is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateEqualTo(Date value) {
            addCriterionForJDBCDate("EmploymentDate =", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EmploymentDate <>", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("EmploymentDate >", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EmploymentDate >=", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateLessThan(Date value) {
            addCriterionForJDBCDate("EmploymentDate <", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EmploymentDate <=", value, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateIn(List<Date> values) {
            addCriterionForJDBCDate("EmploymentDate in", values, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EmploymentDate not in", values, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EmploymentDate between", value1, value2, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andEmploymentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EmploymentDate not between", value1, value2, "employmentdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UpdateDate not between", value1, value2, "updatedate");
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

        public Criteria andInternshippayIsNull() {
            addCriterion("InternshipPay is null");
            return (Criteria) this;
        }

        public Criteria andInternshippayIsNotNull() {
            addCriterion("InternshipPay is not null");
            return (Criteria) this;
        }

        public Criteria andInternshippayEqualTo(Integer value) {
            addCriterion("InternshipPay =", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayNotEqualTo(Integer value) {
            addCriterion("InternshipPay <>", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayGreaterThan(Integer value) {
            addCriterion("InternshipPay >", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayGreaterThanOrEqualTo(Integer value) {
            addCriterion("InternshipPay >=", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayLessThan(Integer value) {
            addCriterion("InternshipPay <", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayLessThanOrEqualTo(Integer value) {
            addCriterion("InternshipPay <=", value, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayIn(List<Integer> values) {
            addCriterion("InternshipPay in", values, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayNotIn(List<Integer> values) {
            addCriterion("InternshipPay not in", values, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayBetween(Integer value1, Integer value2) {
            addCriterion("InternshipPay between", value1, value2, "internshippay");
            return (Criteria) this;
        }

        public Criteria andInternshippayNotBetween(Integer value1, Integer value2) {
            addCriterion("InternshipPay not between", value1, value2, "internshippay");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryIsNull() {
            addCriterion("CorrectionOfSalary is null");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryIsNotNull() {
            addCriterion("CorrectionOfSalary is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryEqualTo(Integer value) {
            addCriterion("CorrectionOfSalary =", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryNotEqualTo(Integer value) {
            addCriterion("CorrectionOfSalary <>", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryGreaterThan(Integer value) {
            addCriterion("CorrectionOfSalary >", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("CorrectionOfSalary >=", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryLessThan(Integer value) {
            addCriterion("CorrectionOfSalary <", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("CorrectionOfSalary <=", value, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryIn(List<Integer> values) {
            addCriterion("CorrectionOfSalary in", values, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryNotIn(List<Integer> values) {
            addCriterion("CorrectionOfSalary not in", values, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryBetween(Integer value1, Integer value2) {
            addCriterion("CorrectionOfSalary between", value1, value2, "correctionofsalary");
            return (Criteria) this;
        }

        public Criteria andCorrectionofsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("CorrectionOfSalary not between", value1, value2, "correctionofsalary");
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