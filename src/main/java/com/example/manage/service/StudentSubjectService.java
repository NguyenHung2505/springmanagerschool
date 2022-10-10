package com.example.manage.service;

import java.util.Optional;

public interface StudentSubjectService <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
}
