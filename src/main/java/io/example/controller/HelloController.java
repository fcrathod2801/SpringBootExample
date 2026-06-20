package io.example.controller;

import io.example.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    List<Student> students = new ArrayList<>();

    @GetMapping("/hi")
    public String hello(){
        return "Hello, World! This is First Example Application.";
    }

    @GetMapping("/addition")
    public int addition (){
        int a=10;
        int b=20;
        return a+b;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        students.add(new Student(1, "John"));
        students.add(new Student(2, "Jane"));
        students.add(new Student(3, "Bob"));
        System.out.println("students "+students.get(0).toString());
        return students;
    }


}
