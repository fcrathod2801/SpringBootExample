package io.example.service;

import io.example.inter.EmployeeInterface;
import io.example.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeImpl implements EmployeeInterface {

    List<Employee> employeeList=new ArrayList<>();
    @Override
    public Employee saveData(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee getDataById(long id) {
        return null;
    }

    @Override
    public Employee updateData(Employee employee) {
        return null;
    }

    @Override
    public void deleteDataById(long id) {

    }

    public List<Employee> getAllData(){
        return employeeList;
    }
}
