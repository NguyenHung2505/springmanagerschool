package com.example.manage.service.impl;

import com.example.manage.model.School;
import com.example.manage.repository.SchoolRepository;
import com.example.manage.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public Iterable findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return schoolRepository.findById(id);
    }

    @Override
    public Object save(School school) {
        return schoolRepository.save(school);
    }


    @Override
    public void remove(Long id) {
        schoolRepository.deleteById(id);
    }
}
