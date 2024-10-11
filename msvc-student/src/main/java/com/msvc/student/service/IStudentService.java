package com.msvc.student.service;

import com.msvc.student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void Save(Student student);

    List<Student> findByCourseId(Long courseId);
}
