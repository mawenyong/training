package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Shiftwork {
    private Integer shiftworkid;

    private String sno;

    private Date shiftdate;

    private String currentclass;

    private String classaftershift;

    private String shiftworkremarks;

    private String enclosure;

    private Date remainingtime;

    private String issendemail;

    private Date createtime;

    private Date updatetime;

    private Integer createpersonnerid;

    private Integer updatepersonnerid;

    public Integer getShiftworkid() {
        return shiftworkid;
    }

    public void setShiftworkid(Integer shiftworkid) {
        this.shiftworkid = shiftworkid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Date getShiftdate() {
        return shiftdate;
    }

    public void setShiftdate(Date shiftdate) {
        this.shiftdate = shiftdate;
    }

    public String getCurrentclass() {
        return currentclass;
    }

    public void setCurrentclass(String currentclass) {
        this.currentclass = currentclass == null ? null : currentclass.trim();
    }

    public String getClassaftershift() {
        return classaftershift;
    }

    public void setClassaftershift(String classaftershift) {
        this.classaftershift = classaftershift == null ? null : classaftershift.trim();
    }

    public String getShiftworkremarks() {
        return shiftworkremarks;
    }

    public void setShiftworkremarks(String shiftworkremarks) {
        this.shiftworkremarks = shiftworkremarks == null ? null : shiftworkremarks.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public Date getRemainingtime() {
        return remainingtime;
    }

    public void setRemainingtime(Date remainingtime) {
        this.remainingtime = remainingtime;
    }

    public String getIssendemail() {
        return issendemail;
    }

    public void setIssendemail(String issendemail) {
        this.issendemail = issendemail == null ? null : issendemail.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getCreatepersonnerid() {
        return createpersonnerid;
    }

    public void setCreatepersonnerid(Integer createpersonnerid) {
        this.createpersonnerid = createpersonnerid;
    }

    public Integer getUpdatepersonnerid() {
        return updatepersonnerid;
    }

    public void setUpdatepersonnerid(Integer updatepersonnerid) {
        this.updatepersonnerid = updatepersonnerid;
    }
}