package com.vishrut.CompanyManagement.repository;

import com.vishrut.CompanyManagement.model.Manager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ManagerRepository {

    //creating DB to store manager details
    Map<Integer,Manager> manDb = new HashMap<>();

    public void addManager(Manager manager) {
        manDb.put(manager.getManagerId(),manager);
    }

    public Manager getManager(int manId) {
        return manDb.get(manId);
    }

    public void updateSalary(int manId, int newsalary) {
        Manager manager = manDb.get(manId);
        manager.setSalary(newsalary);
    }

    public void deleteManager(int manId) {
        manDb.remove(manId);
    }

    public Manager getManagerSal() {
        int max = 0;
        Manager highestPaidManager = null;
        for(int m:manDb.keySet()){
            Manager curr = manDb.get(m);
            if(curr.getSalary()>max){
                max = curr.getSalary();
                highestPaidManager = curr;
            }
        }
        return highestPaidManager;
    }
}
