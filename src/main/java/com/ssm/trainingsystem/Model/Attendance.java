package com.ssm.trainingsystem.Model;

import java.util.Date;

public class Attendance {
    private Integer attendanceid;

    private Date attendancedate;

    private Integer personnelid;

    private String attendancestate;

    private String isremind;

    private Date createdate;

    public Integer getAttendanceid() {
        return attendanceid;
    }

    public void setAttendanceid(Integer attendanceid) {
        this.attendanceid = attendanceid;
    }

    public Date getAttendancedate() {
        return attendancedate;
    }

    public void setAttendancedate(Date attendancedate) {
        this.attendancedate = attendancedate;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public String getAttendancestate() {
        return attendancestate;
    }

    public void setAttendancestate(String attendancestate) {
        this.attendancestate = attendancestate == null ? null : attendancestate.trim();
    }

    public String getIsremind() {
        return isremind;
    }

    public void setIsremind(String isremind) {
        this.isremind = isremind == null ? null : isremind.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}