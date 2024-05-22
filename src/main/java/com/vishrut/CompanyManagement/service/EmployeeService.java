package com.vishrut.CompanyManagement.service;

import com.vishrut.CompanyManagement.model.Employee;
import com.vishrut.CompanyManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    //to use object of repository
    @Autowired
    EmployeeRepository employeerepository;

    public void addEmployee(Employee employee){
        employeerepository.addEmployee(employee);
    }

    public Employee getEmployee(int empId) {
        return employeerepository.getEmployee(empId);
    }

    public Employee updateSalary(int empId, int newSalary) {
        return employeerepository.updateSalary(empId,newSalary);
    }

    public void deleteEmployee(int empId) {
        employeerepository.deleteEmployee(empId);
    }
}
