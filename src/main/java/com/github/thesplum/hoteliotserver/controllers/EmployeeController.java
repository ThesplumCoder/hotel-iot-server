package com.github.thesplum.hoteliotserver.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.thesplum.hoteliotserver.models.Employee;
import com.github.thesplum.hoteliotserver.repositories.EmployeeRepository;

import jakarta.validation.Valid;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepo;

  @GetMapping()
  public List<Employee> getAll() {
    LinkedList<Employee> res = new LinkedList<>();
    for (Employee employee : employeeRepo.findAll()) {
      res.add(employee);
    }
    return res;
  }

  @PostMapping()
  public Employee create(@Valid @RequestBody Employee employee) {
    return employeeRepo.save(employee);
  }

  @DeleteMapping()
  public void deleteById(@RequestBody Employee employee) {
    employeeRepo.deleteById(employee.getId());
  }
}
