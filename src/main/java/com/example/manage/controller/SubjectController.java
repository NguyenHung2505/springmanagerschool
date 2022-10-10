package com.example.manage.controller;

import com.example.manage.model.Subject;
import com.example.manage.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/subjects")

public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping
    public ResponseEntity<Iterable<Subject>> findAllSubject() {
        return new ResponseEntity<>(subjectService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Subject> save(@RequestBody Subject subject) {
        subjectService.save(subject);
        return new ResponseEntity(subjectService, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> findById(@PathVariable Long id) {
        return new ResponseEntity(subjectService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateSubject(@RequestBody Subject subject, @PathVariable Long id) {
        Optional<Subject> subjectOptional = subjectService.findById(id);
        if (!subjectOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        subject.setId(subjectOptional.get().getId());
        subjectService.save(subject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Subject> deleteSubject(@PathVariable Long id) {
        Optional<Subject> subjectOptional = subjectService.findById(id);
        if (!subjectOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        subjectService.remove(id);
        return new ResponseEntity<>(subjectOptional.get(), HttpStatus.NO_CONTENT);
    }
}
