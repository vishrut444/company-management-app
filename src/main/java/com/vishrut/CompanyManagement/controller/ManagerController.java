package com.vishrut.CompanyManagement.controller;

import com.vishrut.CompanyManagement.model.Manager;
import com.vishrut.CompanyManagement.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")//all API's end point will start with this
//e.g. to add employee write this in postman localhost:8080/manager/add-manager
public class ManagerController {
    //making it a layered architecture i.e. controller,service and repository

    //creating object
    @Autowired // this is DI
    ManagerService managerService;

    //API to add manager
    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager){
        managerService.addManager(manager);
        return "Manager Added Successfullyy!!!";
    }

    //API to get details of manager
    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int manId){
        return managerService.getManager(manId);
    }

    //API to update salary of manager
    @PutMapping("/update-salary")
    public String updateSalary(@RequestParam("id") int manId,@RequestParam("salary") int newsalary){
        managerService.updateSalary(manId,newsalary);
        return "Salary Updated Successfully!";
    }

    //API to delete Manager
    @DeleteMapping("/delete-manager")
    public String deleteManager(@RequestParam("id") int manId){
        managerService.deleteManager(manId);
        return "Manager Deleted Successfully!";
    }

    //API to get manager with the highest salary
    @GetMapping("/highest-salary")
    public Manager getManagerSal(){
        return managerService.getManagerSal();
    }



}
