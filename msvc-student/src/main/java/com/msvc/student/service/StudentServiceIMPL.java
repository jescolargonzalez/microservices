package com.msvc.student.service;

import com.msvc.student.entities.Student;
import com.msvc.student.persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceIMPL implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void Save(Student student) {

    }

    @Override
    public List<Student> findByCourseId(Long courseId) {
        return null;
    }

}
