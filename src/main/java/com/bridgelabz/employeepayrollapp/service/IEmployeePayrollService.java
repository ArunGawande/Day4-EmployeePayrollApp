package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollModel;

public interface IEmployeePayrollService {

    String start();

    EmployeePayrollModel getEmployeeById(long id);

    EmployeePayrollModel createEmp(EmployeePayrollModel emp);

    EmployeePayrollModel update(EmployeePayrollModel emp, long id);

    EmployeePayrollModel delete(long id);

}