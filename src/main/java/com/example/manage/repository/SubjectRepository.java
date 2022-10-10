package com.example.manage.repository;

import com.example.manage.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject , Long> {
}
