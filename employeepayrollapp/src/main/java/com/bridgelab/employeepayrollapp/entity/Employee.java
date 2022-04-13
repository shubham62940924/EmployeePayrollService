package com.bridgelab.employeepayrollapp.entity;

import com.bridgelab.employeepayrollapp.dto.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    public long id;
    public String name;
    public long salary;

    public Employee( ){

    }

    public Employee(long id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }
}
