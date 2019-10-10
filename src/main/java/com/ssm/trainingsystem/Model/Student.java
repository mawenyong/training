package com.ssm.trainingsystem.Model;

import com.ssm.trainingsystem.tool.BasePage;

import java.util.Date;

public class Student extends BasePage {
    private Integer studentid;

    private String school;

    private String sno;

    private Integer numberclassid;

    private String major;

    private String tie;

    private String ancestralhome;

    private Date enrollmentdate;

    private Date graduationdate;

    private Date updatedate;

    private Integer personnelid;

    private Integer marketpersonnelid;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Integer getNumberclassid() {
        return numberclassid;
    }

    public void setNumberclassid(Integer numberclassid) {
        this.numberclassid = numberclassid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getTie() {
        return tie;
    }

    public void setTie(String tie) {
        this.tie = tie == null ? null : tie.trim();
    }

    public String getAncestralhome() {
        return ancestralhome;
    }

    public void setAncestralhome(String ancestralhome) {
        this.ancestralhome = ancestralhome == null ? null : ancestralhome.trim();
    }

    public Date getEnrollmentdate() {
        return enrollmentdate;
    }

    public void setEnrollmentdate(Date enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }

    public Date getGraduationdate() {
        return graduationdate;
    }

    public void setGraduationdate(Date graduationdate) {
        this.graduationdate = graduationdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public Integer getMarketpersonnelid() {
        return marketpersonnelid;
    }

    public void setMarketpersonnelid(Integer marketpersonnelid) {
        this.marketpersonnelid = marketpersonnelid;
    }
}