package com.example.manage.service.impl;
import com.example.manage.model.Student;
import com.example.manage.repository.StudentRepository;
import com.example.manage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Iterable findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Object save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }
}
