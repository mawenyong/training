package com.ssm.trainingsystem.Model;

public class Examinationpapers {
    private Integer examinationpapersid;

    private Integer testpaperid;

    private Integer itembankid;

    private String sequencenumber;

    private String topictypes;

    public Integer getExaminationpapersid() {
        return examinationpapersid;
    }

    public void setExaminationpapersid(Integer examinationpapersid) {
        this.examinationpapersid = examinationpapersid;
    }

    public Integer getTestpaperid() {
        return testpaperid;
    }

    public void setTestpaperid(Integer testpaperid) {
        this.testpaperid = testpaperid;
    }

    public Integer getItembankid() {
        return itembankid;
    }

    public void setItembankid(Integer itembankid) {
        this.itembankid = itembankid;
    }

    public String getSequencenumber() {
        return sequencenumber;
    }

    public void setSequencenumber(String sequencenumber) {
        this.sequencenumber = sequencenumber == null ? null : sequencenumber.trim();
    }

    public String getTopictypes() {
        return topictypes;
    }

    public void setTopictypes(String topictypes) {
        this.topictypes = topictypes == null ? null : topictypes.trim();
    }
}