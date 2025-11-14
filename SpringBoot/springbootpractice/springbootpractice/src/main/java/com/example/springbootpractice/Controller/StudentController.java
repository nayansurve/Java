package com.example.springbootpractice.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.springbootpractice.Entity.Student;


@RestController
@RequestMapping("/student")
public class StudentController {

    // GET API
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot!";
    }

    // POST API
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return student;   // returns the same student data
    }
}
