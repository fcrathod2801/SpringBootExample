package io.example.controller;

import io.example.inter.EmployeeInterface;
import io.example.model.Employee;
import io.example.service.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeImpl employeeImpl;


    @PostMapping("/save")
    public Employee saveDetails(@RequestBody Employee employee){
        return employeeImpl.saveData(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllData(){
        return employeeImpl.getAllData();
    }


}
