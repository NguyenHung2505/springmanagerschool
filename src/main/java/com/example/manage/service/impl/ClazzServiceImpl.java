package com.example.manage.service.impl;


import com.example.manage.model.Clazz;
import com.example.manage.repository.ClazzRepository;
import com.example.manage.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzRepository clazzRepository;

    @Override
    public Iterable findAll() {
        return clazzRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return clazzRepository.findById(id);
    }

    @Override
    public Object save(Clazz clazz) {
        return clazzRepository.save(clazz);
    }

    @Override
    public void remove(Long id) {
        clazzRepository.deleteById(id);
    }
}
