package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Testpaper {
    private Integer testpaperid;

    private String namepaper;

    private Integer personnelid;

    private Integer numberclassid;

    private Date createdate;

    private Date releasedate;

    private Date updatedate;

    private String isrelease;

    private Integer totalscore;

    public Integer getTestpaperid() {
        return testpaperid;
    }

    public void setTestpaperid(Integer testpaperid) {
        this.testpaperid = testpaperid;
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

    public Integer getNumberclassid() {
        return numberclassid;
    }

    public void setNumberclassid(Integer numberclassid) {
        this.numberclassid = numberclassid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(String isrelease) {
        this.isrelease = isrelease == null ? null : isrelease.trim();
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }
}