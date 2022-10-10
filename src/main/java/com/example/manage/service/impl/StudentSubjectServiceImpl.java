package com.example.manage.service.impl;

import com.example.manage.repository.StudentSubjectRepository;
import com.example.manage.service.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {
    @Autowired
    StudentSubjectRepository studentSubjectRepository;

    @Override
    public Iterable findAll() {
        return studentSubjectRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return studentSubjectRepository.findById(id);
    }
}
