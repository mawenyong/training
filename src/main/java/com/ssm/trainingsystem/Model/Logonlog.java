package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Logonlog {
    private Integer logid;

    private Date logdate;

    private String logaddress;

    private Integer personnelid;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getLogaddress() {
        return logaddress;
    }

    public void setLogaddress(String logaddress) {
        this.logaddress = logaddress == null ? null : logaddress.trim();
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }
}