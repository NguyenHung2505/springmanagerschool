package com.example.manage.controller;//package com.example.jpa.controller;
import com.example.manage.model.Clazz;
import com.example.manage.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/clazzs")
public class ClazzController {
    @Autowired
    ClazzService clazzService;



    @GetMapping
    public ResponseEntity findAllClass() {
        return new ResponseEntity<>(clazzService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Clazz clazz) {
        clazzService.save(clazz);
        return new ResponseEntity(clazzService, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clazz> findById(@PathVariable Long id) {
        return new ResponseEntity(clazzService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateClazz(@RequestBody Clazz clazz, @PathVariable Long id) {
        Optional<Clazz> clazzOptional = clazzService.findById(id);
        if (!clazzOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        clazz.setId(clazzOptional.get().getId());
        clazzService.save(clazz);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Clazz> deleteClazz(@PathVariable Long id) {
        Optional<Clazz> clazzlOptional = clazzService.findById(id);
        if (!clazzlOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        clazzService.remove(id);
        return new ResponseEntity<>(clazzlOptional.get(), HttpStatus.NO_CONTENT);
    }

}
