package com.vishrut.CompanyManagement;

public class Manager {

    private int managerId;
    private String name;
    private int age;
    private String department;
    private int noOfReportees;

    public Manager() {

    }

    public Manager(int managerId, String name, int age, String department, int noOfReportees) {
        this.managerId = managerId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.noOfReportees = noOfReportees;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNoOfReportees() {
        return noOfReportees;
    }

    public void setNoOfReportees(int noOfReportees) {
        this.noOfReportees = noOfReportees;
    }
}
