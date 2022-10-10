package com.example.manage.service;
import com.example.manage.model.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface StudentService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(Student student);

    void remove(Long id);
}
