package com.ssm.trainingsystem.Service.imp;

import com.ssm.trainingsystem.Dao.AttendanceMapper;
import com.ssm.trainingsystem.Model.Attendance;
import com.ssm.trainingsystem.Service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImp implements AttendanceService {

    @Autowired
    private AttendanceMapper attendanceMapper;

    /**
     * 每天的添加人员考勤信息
     * @param attendance 考勤实体
     * @return 添加是否成功
     */
    @Override
    public int add(Attendance attendance) {
        int temp=0;   //保存失败
        if(attendance.getPersonnelid()==0){
            temp=-1;  //人员信息主键不能为空或者为零
        }else{
            temp=attendanceMapper.insertSelective(attendance);
        }
        return temp;
    }

    /**
     * 根据主键修改学生考勤
     * @param attendance
     * @return
     */
    @Override
    public int Update(Attendance attendance) {
        int temp=0;   //保存失败
        if (attendance.getAttendanceid()==0){
            temp=-2;  //修改主键不能为空
        }else{
            temp=attendanceMapper.updateByPrimaryKeySelective(attendance);
        }
        return temp;
    }

    /**
     * 获取全部数据
     * @param attendance 查询条件
     * @return 查询结果
     */
    @Override
    public List<Attendance> getAll(Attendance attendance) {
        return attendanceMapper.selectAll(attendance);
    }

    /**
     * 根据主键获取某个人的考勤
     * @param attendanceid 修改考勤的主键
     * @return 修改的信息
     */
    @Override
    public Attendance getOne(int attendanceid) {
        Attendance attendance=new Attendance();
        attendance=null;
        if (attendanceid!=0){
            attendance=attendanceMapper.selectOne(attendanceid);
        }
        return attendance;
    }
}
