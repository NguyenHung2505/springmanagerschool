package com.example.manage.service;


import com.example.manage.model.Clazz;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ClazzService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(Clazz clazz);

    void remove(Long id);
}
