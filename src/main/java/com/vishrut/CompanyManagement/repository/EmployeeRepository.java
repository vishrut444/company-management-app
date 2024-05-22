package com.vishrut.CompanyManagement.repository;

import com.vishrut.CompanyManagement.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {
    Map<Integer, Employee> empDb = new HashMap<>();

    public void addEmployee(Employee employee){
        empDb.put(employee.getEmpId(),employee);
    }

    public Employee getEmployee(int empId) {
        return empDb.get(empId);
    }

    public Employee updateSalary(int empId, int newSalary) {
        Employee emp = empDb.get(empId);
        emp.setSalary(newSalary);
        return emp;
    }

    public void deleteEmployee(int empId) {
        empDb.remove(empId);
    }
}
