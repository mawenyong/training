package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int selectStudentNo(String sno);

    int selectStudentSon(Student student1);

    List<Student> selectAll(Student student);
}