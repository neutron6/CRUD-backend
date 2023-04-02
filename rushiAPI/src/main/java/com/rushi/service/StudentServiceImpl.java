package com.rushi.service;

import com.rushi.model.Student;

import java.util.List;

public interface StudentServiceImpl {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}
