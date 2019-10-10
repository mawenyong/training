package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Itembank {
    private Integer itembankid;

    private Integer typequestionsid;

    private String topictypes;

    private String questioncontent;

    private String testscores;

    private String questionanswers;

    private Integer personnelid;

    private Date createdate;

    private Date updatedate;

    private Date releasedate;

    private String isrelease;

    private String remarks;

    public Integer getItembankid() {
        return itembankid;
    }

    public void setItembankid(Integer itembankid) {
        this.itembankid = itembankid;
    }

    public Integer getTypequestionsid() {
        return typequestionsid;
    }

    public void setTypequestionsid(Integer typequestionsid) {
        this.typequestionsid = typequestionsid;
    }

    public String getTopictypes() {
        return topictypes;
    }

    public void setTopictypes(String topictypes) {
        this.topictypes = topictypes == null ? null : topictypes.trim();
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }

    public String getTestscores() {
        return testscores;
    }

    public void setTestscores(String testscores) {
        this.testscores = testscores == null ? null : testscores.trim();
    }

    public String getQuestionanswers() {
        return questionanswers;
    }

    public void setQuestionanswers(String questionanswers) {
        this.questionanswers = questionanswers == null ? null : questionanswers.trim();
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(String isrelease) {
        this.isrelease = isrelease == null ? null : isrelease.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}