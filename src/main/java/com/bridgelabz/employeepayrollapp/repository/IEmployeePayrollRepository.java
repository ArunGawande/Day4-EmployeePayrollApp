package com.bridgelabz.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollModel;

public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollModel, Long>{

}