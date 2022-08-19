package com.blz.EmployeePayroll.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.blz.EmployeePayroll.Dto.EmployeePayrollDto;

import lombok.Data;

@Entity
@Data
public class EmployeePayrollModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String name;
    private double salary;

    private String emailId;
    private String pwd;

    @OneToOne
    private Department department;

    public EmployeePayrollModel(EmployeePayrollDto employeePayrollDto) {
        this.name=employeePayrollDto.getName();
        this.salary=employeePayrollDto.getSalary();
        this.emailId=employeePayrollDto.getEmailId();
        this.pwd=employeePayrollDto.getPwd();

    }

    public EmployeePayrollModel() {
        super();
    }

}
