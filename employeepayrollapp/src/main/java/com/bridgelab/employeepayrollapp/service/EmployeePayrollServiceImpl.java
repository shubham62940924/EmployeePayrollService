package com.bridgelab.employeepayrollapp.service;

import com.bridgelab.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelab.employeepayrollapp.entity.Employee;
import com.bridgelab.employeepayrollapp.exception.EmployeePayrollException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {
    @Override
    public List<Employee> getEmployeePayrollData() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, new EmployeeDTO("Avinash", 800000)));
        employeeList.add(new Employee(2, new EmployeeDTO("Singh", 84000000)));
        return employeeList;
    }
    @Override
    public Employee getEmployeeById(long id) {
        Employee employee = null;
        if(id == 1) {
            employee = new Employee(1,new EmployeeDTO("Don",10000));
            return employee; }
        else {
            throw new EmployeePayrollException("Employee with Given ID Not Found."); }
    }


    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    @Override
    public Employee updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1,employeeDTO);
        return employee;
    }

    @Override
    public void deleteEmployee(long Id) {

    }

}
