package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollModel;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("")
    public String start() {
        return employeePayrollService.start();
    }

    @GetMapping("/getEmployee/{id}")
    public EmployeePayrollModel getEmployee(@PathVariable long id) {
        return employeePayrollService.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollModel create(@RequestBody EmployeePayrollModel emp) {
        EmployeePayrollModel emp1 = new EmployeePayrollModel();
        emp1.setName(emp.getName());
        emp1.setSalary(emp.getSalary());

        return employeePayrollService.createEmp(emp1);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollModel update(@RequestBody EmployeePayrollModel emp, @PathVariable long id) {

        return employeePayrollService.update(emp,id);
    }

    @DeleteMapping("/delete/{id}")
    public EmployeePayrollModel delete( @PathVariable long id) {
        return employeePayrollService.delete(id);
    }


}