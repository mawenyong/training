package com.ssm.trainingsystem.Model;

public class Numberclass {
    private Integer numberclassid;

    private String classname;

    private String school;

    private String remarks;

    private String classroomuumber;

    public Integer getNumberclassid() {
        return numberclassid;
    }

    public void setNumberclassid(Integer numberclassid) {
        this.numberclassid = numberclassid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getClassroomuumber() {
        return classroomuumber;
    }

    public void setClassroomuumber(String classroomuumber) {
        this.classroomuumber = classroomuumber == null ? null : classroomuumber.trim();
    }
}