package com.example.manage.service.impl;


import com.example.manage.model.Subject;
import com.example.manage.repository.SubjectRepository;
import com.example.manage.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SubjectServceImpl implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
    @Override
    public Iterable findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public Object save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void remove(Long id) {
        subjectRepository.deleteById(id);
    }
}
