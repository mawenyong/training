package com.ssm.trainingsystem.Controller;

import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.StudentService;
import com.ssm.trainingsystem.tool.ResponseMessage;
import com.ssm.trainingsystem.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @ApiOperation("添加学生信息")
    @RequestMapping(value = "/addStudent",method = RequestMethod.PUT)
    public ResponseMessage AddStudent(@RequestBody Student student) {
        System.out.println("进入学生添加方法");
        int temp = 0; //失败

        if (student != null) {
            temp = studentService.add(student);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            switch (temp){
                case -2:
                    str="学生编号不能为空";
                    break;
                case -3:
                    str="学生班级不能为空";
                    break;
                case -4:
                    str="学生毕业时间不能为空";
                    break;
                case -1:
                    str="学生编号重复";
                    break;
            }
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation(value = "根据条件取全部学生信息")
    @RequestMapping(value = "/getAllStudent",produces = "application/json;charset=utf-8",method = RequestMethod.PUT)
    public ResponseMessage getAll(@RequestBody Student student){
        System.out.println("进入后台接口方法"+student.getSno());
        Map<String,List> map = new HashMap<>();
        List<Student> listStudent=studentService.getAll(student);
        map.put("list",listStudent);
        return Result.success("200", map);
    }

    @CrossOrigin
    @ApiOperation("修改学生信息")
    @RequestMapping(value = "/updateStudent",method = RequestMethod.PUT)
    public ResponseMessage UpdateStudent(@RequestBody Student student) {
        System.out.println("进入学生修改方法");
        int temp = 0; //失败

        if (student != null) {
            temp = studentService.Update(student);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            switch (temp){
                case -1:
                    str="学生编号重复";
                    break;
            }
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation("根据学生主键获取信息")
    @RequestMapping(value = "/getOneStudent",method = RequestMethod.GET)
    public ResponseMessage getStudent(@RequestParam Integer studentId) {
        System.out.println("获取学生信息");
        Student student=null; //失败

        if (studentId != 0) {
            student=new Student();
            student = studentService.getOne(studentId);
            System.out.println("返回值为：" + student);
        }

        return Result.success("1", student);

    }


}
