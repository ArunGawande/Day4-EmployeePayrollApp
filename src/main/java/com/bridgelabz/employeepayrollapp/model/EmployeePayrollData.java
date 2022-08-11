package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    private double Salary;
    private  String name;
    private int employeeID;

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = empId;
        this.name = employeePayrollDTO.getName();
        this.Salary= employeePayrollDTO.getSalary();
    }
    public EmployeePayrollData() {
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}