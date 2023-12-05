package com.github.thesplum.hoteliotserver.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.thesplum.hoteliotserver.models.Employee;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
  //
}
