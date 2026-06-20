package io.example.controller;

import io.example.model.Stud;
import io.example.service.StudAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentDetailsController {

    @Autowired
    StudAddressService studAddressService;

    @PostMapping("/studnet")
    public String saveStudentDetails(@RequestBody Stud stud){
        studAddressService.saveData(stud);
        return "Student details saved successfully";
    }

    @GetMapping("/student")
    public List<Stud> getStudentDetails() {
        return studAddressService.getAllData();
    }
}
