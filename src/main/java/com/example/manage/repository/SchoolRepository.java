package com.example.manage.repository;

import com.example.manage.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository <School , Long> {
}
