package com.ssm.trainingsystem.Service.imp;

import com.ssm.trainingsystem.Dao.StudentMapper;
import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        int temp=0;  //失败
        //1.判断所有主要信息不能为空
        if(student.getSno()==null) {
            temp= -2;   //学生编号不能为空
        }
        else if(student.getNumberclassid()==0){
            temp= -3;   //学生班级不能为空
        }
        else if(student.getGraduationdate()==null){
            temp= -4;   //学生毕业时间不能为空
        }else{
            //2.判断学生编号不能重复
            int count=studentMapper.selectStudentNo(student.getSno());
            System.out.println("相同的编号总数为："+count);
             if (count==0){
                //添加数据
                temp=studentMapper.insertSelective(student);
            }else{
                //编号重复
                temp= -1;
            }
        }

        return temp;


    }
}
