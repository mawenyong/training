package com.ssm.trainingsystem.Model;

public class Role {
    private Integer roleid;

    private String rolename;

    private String roleremarks;

    private String isenable;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoleremarks() {
        return roleremarks;
    }

    public void setRoleremarks(String roleremarks) {
        this.roleremarks = roleremarks == null ? null : roleremarks.trim();
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }
}