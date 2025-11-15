package com.example.springbootpractice.Controller;

import com.example.springbootpractice.Entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return student;   // return same data back
    
}
}

//Controller