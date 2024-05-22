package com.vishrut.CompanyManagement.service;

import com.vishrut.CompanyManagement.model.Manager;
import com.vishrut.CompanyManagement.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired//this is Dependency Injection(DI)
    ManagerRepository managerRepository;

    public void addManager(Manager manager) {
        managerRepository.addManager(manager);
    }

    public Manager getManager(int manId) {
        return managerRepository.getManager(manId);
    }

    public void updateSalary(int manId, int newsalary) {
        managerRepository.updateSalary(manId,newsalary);
    }

    public void deleteManager(int manId) {
        managerRepository.deleteManager(manId);
    }

    public Manager getManagerSal() {
        return managerRepository.getManagerSal();
    }
}
