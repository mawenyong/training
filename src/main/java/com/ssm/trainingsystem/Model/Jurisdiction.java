package com.ssm.trainingsystem.Model;

public class Jurisdiction {
    private Integer jurisdictionid;

    private String interfacename;

    private String url;

    private String remarks;

    private String modelname;

    private Integer parentjurisdictionid;

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public Integer getParentjurisdictionid() {
        return parentjurisdictionid;
    }

    public void setParentjurisdictionid(Integer parentjurisdictionid) {
        this.parentjurisdictionid = parentjurisdictionid;
    }
}