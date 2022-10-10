package com.example.manage.repository;

import com.example.manage.model.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSubjectRepository extends JpaRepository <StudentSubject , Long> {
}
