package com.ssm.trainingsystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItembankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItembankExample() {
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

        public Criteria andTypequestionsidIsNull() {
            addCriterion("typequestionsid is null");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidIsNotNull() {
            addCriterion("typequestionsid is not null");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidEqualTo(Integer value) {
            addCriterion("typequestionsid =", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidNotEqualTo(Integer value) {
            addCriterion("typequestionsid <>", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidGreaterThan(Integer value) {
            addCriterion("typequestionsid >", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typequestionsid >=", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidLessThan(Integer value) {
            addCriterion("typequestionsid <", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidLessThanOrEqualTo(Integer value) {
            addCriterion("typequestionsid <=", value, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidIn(List<Integer> values) {
            addCriterion("typequestionsid in", values, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidNotIn(List<Integer> values) {
            addCriterion("typequestionsid not in", values, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidBetween(Integer value1, Integer value2) {
            addCriterion("typequestionsid between", value1, value2, "typequestionsid");
            return (Criteria) this;
        }

        public Criteria andTypequestionsidNotBetween(Integer value1, Integer value2) {
            addCriterion("typequestionsid not between", value1, value2, "typequestionsid");
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

        public Criteria andQuestioncontentIsNull() {
            addCriterion("questioncontent is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIsNotNull() {
            addCriterion("questioncontent is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentEqualTo(String value) {
            addCriterion("questioncontent =", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotEqualTo(String value) {
            addCriterion("questioncontent <>", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThan(String value) {
            addCriterion("questioncontent >", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("questioncontent >=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThan(String value) {
            addCriterion("questioncontent <", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThanOrEqualTo(String value) {
            addCriterion("questioncontent <=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLike(String value) {
            addCriterion("questioncontent like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotLike(String value) {
            addCriterion("questioncontent not like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIn(List<String> values) {
            addCriterion("questioncontent in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotIn(List<String> values) {
            addCriterion("questioncontent not in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentBetween(String value1, String value2) {
            addCriterion("questioncontent between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotBetween(String value1, String value2) {
            addCriterion("questioncontent not between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andTestscoresIsNull() {
            addCriterion("testscores is null");
            return (Criteria) this;
        }

        public Criteria andTestscoresIsNotNull() {
            addCriterion("testscores is not null");
            return (Criteria) this;
        }

        public Criteria andTestscoresEqualTo(String value) {
            addCriterion("testscores =", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresNotEqualTo(String value) {
            addCriterion("testscores <>", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresGreaterThan(String value) {
            addCriterion("testscores >", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresGreaterThanOrEqualTo(String value) {
            addCriterion("testscores >=", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresLessThan(String value) {
            addCriterion("testscores <", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresLessThanOrEqualTo(String value) {
            addCriterion("testscores <=", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresLike(String value) {
            addCriterion("testscores like", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresNotLike(String value) {
            addCriterion("testscores not like", value, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresIn(List<String> values) {
            addCriterion("testscores in", values, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresNotIn(List<String> values) {
            addCriterion("testscores not in", values, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresBetween(String value1, String value2) {
            addCriterion("testscores between", value1, value2, "testscores");
            return (Criteria) this;
        }

        public Criteria andTestscoresNotBetween(String value1, String value2) {
            addCriterion("testscores not between", value1, value2, "testscores");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersIsNull() {
            addCriterion("questionanswers is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersIsNotNull() {
            addCriterion("questionanswers is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersEqualTo(String value) {
            addCriterion("questionanswers =", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersNotEqualTo(String value) {
            addCriterion("questionanswers <>", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersGreaterThan(String value) {
            addCriterion("questionanswers >", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersGreaterThanOrEqualTo(String value) {
            addCriterion("questionanswers >=", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersLessThan(String value) {
            addCriterion("questionanswers <", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersLessThanOrEqualTo(String value) {
            addCriterion("questionanswers <=", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersLike(String value) {
            addCriterion("questionanswers like", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersNotLike(String value) {
            addCriterion("questionanswers not like", value, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersIn(List<String> values) {
            addCriterion("questionanswers in", values, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersNotIn(List<String> values) {
            addCriterion("questionanswers not in", values, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersBetween(String value1, String value2) {
            addCriterion("questionanswers between", value1, value2, "questionanswers");
            return (Criteria) this;
        }

        public Criteria andQuestionanswersNotBetween(String value1, String value2) {
            addCriterion("questionanswers not between", value1, value2, "questionanswers");
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