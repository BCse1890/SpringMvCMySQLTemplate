package com.bobcurrie.dojo.dojoClasses.controller;

import com.bobcurrie.dojo.dojoClasses.model.Student;
import com.bobcurrie.dojo.dojoClasses.repository.StudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getLocations() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentRepository.findById(id).get();
    }

}
