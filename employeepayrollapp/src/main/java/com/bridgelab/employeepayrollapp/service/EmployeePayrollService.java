package com.bridgelab.employeepayrollapp.service;

import com.bridgelab.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelab.employeepayrollapp.entity.Employee;

import java.util.List;

public interface EmployeePayrollService {
    List<Employee> getEmployeePayrollData();
    Employee getEmployeeById(long id);

    Employee createEmployee(EmployeeDTO employeeDTO);

    Employee updateEmployee(EmployeeDTO employeeDTO);

    void deleteEmployee(long Id);
}
