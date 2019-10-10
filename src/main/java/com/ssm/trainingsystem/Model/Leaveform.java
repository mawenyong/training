package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Leaveform {
    private Integer leaveformid;

    private String sno;

    private Date leavebegindate;

    private Date leaveenddate;

    private String reasonforleave;

    private Date approvaldate;

    private String tno;

    private Date createdate;

    private String approvalstate;

    private String remarks;

    public Integer getLeaveformid() {
        return leaveformid;
    }

    public void setLeaveformid(Integer leaveformid) {
        this.leaveformid = leaveformid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Date getLeavebegindate() {
        return leavebegindate;
    }

    public void setLeavebegindate(Date leavebegindate) {
        this.leavebegindate = leavebegindate;
    }

    public Date getLeaveenddate() {
        return leaveenddate;
    }

    public void setLeaveenddate(Date leaveenddate) {
        this.leaveenddate = leaveenddate;
    }

    public String getReasonforleave() {
        return reasonforleave;
    }

    public void setReasonforleave(String reasonforleave) {
        this.reasonforleave = reasonforleave == null ? null : reasonforleave.trim();
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(String approvalstate) {
        this.approvalstate = approvalstate == null ? null : approvalstate.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}