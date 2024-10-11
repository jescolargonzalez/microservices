package com.msvc.student.persistence;

import com.msvc.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findAllByCourseId(Long courseId);

    @Query("SELECT s FROM Student s WHERE s.courseId = :courseId")
    List<Student> findAllByStudents(Long courseId);

}
