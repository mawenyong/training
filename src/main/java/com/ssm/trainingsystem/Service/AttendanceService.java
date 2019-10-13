package com.ssm.trainingsystem.Service;

import com.ssm.trainingsystem.Model.Attendance;

import java.util.List;

public interface AttendanceService {

    public int add(Attendance attendance);

    public int Update(Attendance attendance);

    public List<Attendance> getAll(Attendance attendance);

    public Attendance getOne(int attendanceid);
}
