package com.example.StudentGrader.Repository;

import com.example.StudentGrader.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
