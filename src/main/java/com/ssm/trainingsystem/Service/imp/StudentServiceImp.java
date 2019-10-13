package com.ssm.trainingsystem.Service.imp;

import com.ssm.trainingsystem.Dao.StudentMapper;
import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int Update(Student student) {
        int temp=0;
        if (student.getStudentid()!=0){
            temp=-1;  //没有主键不能进行修改
        }else{
            Student student1=new Student();
            student1.setSno(student.getSno());
            student1.setStudentid(student.getStudentid());
            int count=studentMapper.selectStudentSon(student1);
            if (count==0){
                temp=studentMapper.updateByPrimaryKeySelective(student);
            }else{
                temp=-1;
            }
        }
        return temp;
    }

    @Override
    public List<Student> getAll(Student student) {
        List<Student> temp=studentMapper.selectAll(student);
        return null;
    }

    @Override
    public Student getOne(int studentid) {
        return null;
    }
}
