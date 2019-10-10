package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Loginperson {
    private Integer loginpersonid;

    private String loginname;

    private String loginpwd;

    private Date createtime;

    public Integer getLoginpersonid() {
        return loginpersonid;
    }

    public void setLoginpersonid(Integer loginpersonid) {
        this.loginpersonid = loginpersonid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}