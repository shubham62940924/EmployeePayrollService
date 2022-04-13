package com.bridgelab.employeepayrollapp.controller;

import com.bridgelab.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelab.employeepayrollapp.dto.ResponseDTO;
import com.bridgelab.employeepayrollapp.entity.Employee;
import com.bridgelab.employeepayrollapp.service.EmployeePayrollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
@Slf4j
public class EmployeePayrollController {
    @Autowired
    private EmployeePayrollService employeePayrollService;
    /**
     *response entity represents the whole http response:status code
     * ,headers and body(we can use it fully configure the http response)
     * if i want to use  it i have to return it from end point(HttpStatus.OK)
     * @return
     */
    @RequestMapping(value = {"", "/", "/getemployee"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        log.info("inside my controller");
        List<Employee> employeeList = null;
      employeeList = employeePayrollService.getEmployeePayrollData();
//        Employee employee = null;
//        employee = new Employee(1, new EmployeeDTO("Shubham", 800000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", employeeList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param empId
     * @return
     */
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        Employee employee = null;
        employee = new Employee(1, new EmployeeDTO("Singh is King", 800000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for ID", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param employeeDTO
     * @return
     */
    @PostMapping("/createemployee")
    public ResponseEntity<ResponseDTO> createEmployeeData( @Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee = null;
        employee = new Employee(1,  employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Data for", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     *
     * @param employeeDTO
     * @param empId
     * @return
     */
    @PutMapping("/updateemployee/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@Valid @RequestBody EmployeeDTO employeeDTO, @PathVariable("empId") int empId){
        Employee employee = null;
        employee = new Employee(1, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("update Employee Data for", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    /**
     *
     * @param empId
     * @return
     */
    @DeleteMapping("/deleteemployee/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        ResponseDTO responseDTO = new ResponseDTO("Delete Employee Data for","Deleted Id: ", empId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}

