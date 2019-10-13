package com.ssm.trainingsystem.Service;

import com.ssm.trainingsystem.Model.Student;

import java.util.List;

public interface StudentService {

    public int add(Student student);

    public int Update(Student student);

    public List<Student> getAll(Student student);

    public Student getOne(int studentid);
}
