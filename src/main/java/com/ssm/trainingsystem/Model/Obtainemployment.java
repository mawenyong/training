package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Obtainemployment {
    private Integer obtainemploymentid;

    private String sno;

    private String employmentdirection;

    private String enclosure;

    private String picture;

    private String employmentcity;

    private Date employmentdate;

    private Date updatedate;

    private Date createdate;

    private Integer internshippay;

    private Integer correctionofsalary;

    public Integer getObtainemploymentid() {
        return obtainemploymentid;
    }

    public void setObtainemploymentid(Integer obtainemploymentid) {
        this.obtainemploymentid = obtainemploymentid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getEmploymentdirection() {
        return employmentdirection;
    }

    public void setEmploymentdirection(String employmentdirection) {
        this.employmentdirection = employmentdirection == null ? null : employmentdirection.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getEmploymentcity() {
        return employmentcity;
    }

    public void setEmploymentcity(String employmentcity) {
        this.employmentcity = employmentcity == null ? null : employmentcity.trim();
    }

    public Date getEmploymentdate() {
        return employmentdate;
    }

    public void setEmploymentdate(Date employmentdate) {
        this.employmentdate = employmentdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getInternshippay() {
        return internshippay;
    }

    public void setInternshippay(Integer internshippay) {
        this.internshippay = internshippay;
    }

    public Integer getCorrectionofsalary() {
        return correctionofsalary;
    }

    public void setCorrectionofsalary(Integer correctionofsalary) {
        this.correctionofsalary = correctionofsalary;
    }
}