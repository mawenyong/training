package com.ssm.trainingsystem.Model;

public class Typequestions {
    private Integer typequestionsid;

    private String typename;

    private String remarks;

    private Integer parenttypequestionsid;

    public Integer getTypequestionsid() {
        return typequestionsid;
    }

    public void setTypequestionsid(Integer typequestionsid) {
        this.typequestionsid = typequestionsid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getParenttypequestionsid() {
        return parenttypequestionsid;
    }

    public void setParenttypequestionsid(Integer parenttypequestionsid) {
        this.parenttypequestionsid = parenttypequestionsid;
    }
}