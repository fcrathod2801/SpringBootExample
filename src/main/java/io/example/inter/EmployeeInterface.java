package io.example.inter;

import io.example.model.Employee;

import java.util.List;

public interface EmployeeInterface {
     Employee saveData(Employee employee);

     Employee getDataById(long id);

     Employee updateData(Employee employee);

     void deleteDataById(long id);

     List<Employee> getAllData();

}
