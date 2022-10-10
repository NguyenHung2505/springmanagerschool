package com.example.manage.service;

import com.example.manage.model.School;

import java.util.Optional;

public interface SchoolService <T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(School school);

    void remove(Long id);
}
