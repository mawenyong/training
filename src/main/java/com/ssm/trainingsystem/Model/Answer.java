package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Answer {
    private Integer answerid;

    private Integer answerspaperid;

    private String namepaper;

    private Integer personnelid;

    private String isqualified;

    private Date begindate;

    private Date enddate;

    private String remarks;

    private Date enddateofmarking;

    private Date releasedate;

    private String issubmit;

    private Date submitdate;

    private Integer totalscore;

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getAnswerspaperid() {
        return answerspaperid;
    }

    public void setAnswerspaperid(Integer answerspaperid) {
        this.answerspaperid = answerspaperid;
    }

    public String getNamepaper() {
        return namepaper;
    }

    public void setNamepaper(String namepaper) {
        this.namepaper = namepaper == null ? null : namepaper.trim();
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public String getIsqualified() {
        return isqualified;
    }

    public void setIsqualified(String isqualified) {
        this.isqualified = isqualified == null ? null : isqualified.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getEnddateofmarking() {
        return enddateofmarking;
    }

    public void setEnddateofmarking(Date enddateofmarking) {
        this.enddateofmarking = enddateofmarking;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(String issubmit) {
        this.issubmit = issubmit == null ? null : issubmit.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }
}