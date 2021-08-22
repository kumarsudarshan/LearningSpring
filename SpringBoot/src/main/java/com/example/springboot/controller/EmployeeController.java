package com.example.springboot.controller;

import com.example.springboot.entities.Employee;
import com.example.springboot.repository.EmployeeRepository;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployeeDetails(int id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/allemployee")
    public List<Employee> getAllEmployeeDetails(){
        return employeeRepository.findAll();
    }

}
