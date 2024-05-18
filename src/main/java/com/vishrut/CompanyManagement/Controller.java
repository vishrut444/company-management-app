package com.vishrut.CompanyManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//All the api code is written inside controller class
@RestController // we are making rest api so we write it
public class Controller {
    //we will use map as our database
    //int: key Employee: value
    Map<Integer,Employee> empDb = new HashMap<>();

    //This is Api
    //Api = api endPoint + api Code

    //API to add employee details in map
    @PostMapping("/add-employee") //API endpoint
    public String addEmployee(@RequestBody Employee employee){ //API code
        empDb.put(employee.getEmpId(),employee);
        return "Employee added successfully!!!";
    }

    //API to get information of employee
    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId){
        return empDb.get(empId);
    }

    //API to delete an entry
    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId){
        empDb.remove(empId);
        return "Employee Deleted Successfullu!!!";
    }

    //API to update salary of employee
    @PatchMapping("/update-salary")
    public String updateSalary(@RequestParam("id") int empId,@RequestParam("salary") int newSalary){
        Employee emp = empDb.get(empId);
        emp.setSalary(newSalary);//No need to put back into the map since emp is a reference to the object in the map
        return "salary updated successfully";
    }

    //do above functionalities for manager also home-work
    Map<Integer,Manager> manDb = new HashMap<>();//Db to store manager information

    //API to add manager details
    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager){
        manDb.put(manager.getManagerId(),manager);
        return "Manager added successfully!!!";
    }
    //API to see manager details
    @GetMapping("/get-manager/{id}")
    public Manager gerManager(@PathVariable("id") int manId){
        return manDb.get(manId);
    }
    //API to update manager salary
    @PatchMapping("/update-manager-salary")
    public String updSalary(@RequestParam("id") int manId,@RequestParam("salary") int newSalary){
        Manager m = manDb.get(manId);
        m.setSalary(newSalary);
        return "salary updated successfully";
    }

    //API to delete manager
    @DeleteMapping("/delete-manager")
    public String deleteManager(@RequestParam int manId){
        manDb.remove(manId);
        return "Manager deleted successfully";
    }

}
