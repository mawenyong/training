package com.ssm.trainingsystem.Controller;

import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation("添加学生信息")
    @RequestMapping(value = "/addStudent",method = RequestMethod.PUT)
    public int AddStudent(@RequestBody Student student){
        System.out.println("进入学生添加方法");
        int temp=0; //失败

        if(student!=null){
            temp=studentService.add(student);
        }
        System.out.println("返回值为："+temp);
        return temp;
    }
}
