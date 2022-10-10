package com.example.manage.controller;

import com.example.manage.model.School;
import com.example.manage.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/schools")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping
    public ResponseEntity<Iterable<School>> findAllSchool() {
        return new ResponseEntity<>(schoolService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<School> save(@RequestBody School school) {
        schoolService.save(school);
        return new ResponseEntity(schoolService, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<School> findById(@PathVariable(value = "id") Long id) {
        return new ResponseEntity(schoolService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateSchool(@RequestBody School school, @PathVariable(value = "id") Long id) {
        Optional<School> schoolOptional = schoolService.findById(id);
        if (!schoolOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        school.setId(schoolOptional.get().getId());
        schoolService.save(school);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<School> deleteSchool(@PathVariable(value = "id") Long id) {
        Optional<School> schoolOptional = schoolService.findById(id);
        if (!schoolOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        schoolService.remove(id);
        return new ResponseEntity<>(schoolOptional.get(), HttpStatus.NO_CONTENT);
    }

}
