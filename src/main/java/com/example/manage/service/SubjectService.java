package com.example.manage.service;



import com.example.manage.model.Subject;

import java.util.Optional;

public interface SubjectService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(Subject subject);

    void remove(Long id);
}
