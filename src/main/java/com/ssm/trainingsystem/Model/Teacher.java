package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Teacher {
    private Integer teacherid;

    private String scopeofinstruction;

    private String tno;

    private Date initiationdate;

    private Integer personnelid;

    private Date updatedate;

    private String resume;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getScopeofinstruction() {
        return scopeofinstruction;
    }

    public void setScopeofinstruction(String scopeofinstruction) {
        this.scopeofinstruction = scopeofinstruction == null ? null : scopeofinstruction.trim();
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public Date getInitiationdate() {
        return initiationdate;
    }

    public void setInitiationdate(Date initiationdate) {
        this.initiationdate = initiationdate;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }
}