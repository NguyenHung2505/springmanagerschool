package com.example.manage.controller;

import com.example.manage.model.Student;
import com.example.manage.model.StudentSubject;
import com.example.manage.service.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/studentSubjectServiceControllers")
public class StudentSubjectServiceController {
 @Autowired
    StudentSubjectService subjectService;

    @GetMapping
    public ResponseEntity<Iterable<StudentSubject>> findAllStudent() {
        return new ResponseEntity<>(subjectService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentSubject> findById(@PathVariable Long id) {
        return new ResponseEntity(subjectService.findById(id), HttpStatus.OK);
    }

}
