package com.ssm.trainingsystem.Controller;

import com.ssm.trainingsystem.Model.Attendance;
import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.AttendanceService;
import com.ssm.trainingsystem.tool.ResponseMessage;
import com.ssm.trainingsystem.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "Attendance")
@RestController
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @CrossOrigin
    @ApiOperation("添加学生出勤信息")
    @RequestMapping(value = "/addAttendance",method = RequestMethod.PUT)
    public ResponseMessage AddAttendance(@RequestBody Attendance attendance) {
        System.out.println("进入学生添加出勤方法");
        int temp = 0; //失败

        if (attendance != null) {
            temp = attendanceService.add(attendance);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            switch (temp){
                case -1:
                    str="学生编号不能为空";
                    break;
            }
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation(value = "根据条件取全部学生出勤信息")
    @RequestMapping(value = "/getAllAttendance",produces = "application/json;charset=utf-8",method = RequestMethod.PUT)
    public ResponseMessage getAll(@RequestBody Attendance attendance){
        System.out.println("进入后台接口方法");
        Map<String,List> map = new HashMap<>();
        List<Attendance> listAttendance=attendanceService.getAll(attendance);
        map.put("list",listAttendance);
        return Result.success("200", map);
    }

    @CrossOrigin
    @ApiOperation("修改学生考勤信息")
    @RequestMapping(value = "/updateAttendance",method = RequestMethod.PUT)
    public ResponseMessage UpdateAttendance(@RequestBody Attendance attendance) {
        System.out.println("进入学生修改方法");
        int temp = 0; //失败

        if (attendance != null) {
            temp = attendanceService.Update(attendance);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation("根据学生出勤主键获取信息")
    @RequestMapping(value = "/getOneAttendance",method = RequestMethod.GET)
    public ResponseMessage getAttendance(@RequestParam Integer attendanceId) {
        System.out.println("获取学生信息");
        Attendance attendance=null; //失败

        if (attendanceId != 0) {
            attendance=new Attendance();
            attendance = attendanceService.getOne(attendanceId);
            System.out.println("返回值为：" + attendance);
        }

        return Result.success("1", attendance);

    }


}
