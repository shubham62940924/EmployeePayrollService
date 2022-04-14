package com.bridgelab.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeDTO {
    @NotEmpty(message = "please enter your name")
    @Pattern(regexp = "[A-Z]{1}[a-zA-z\\s]{2,}$",message ="employee name is invalid")
    public String name;
    @Min(value = 5000, message = "salary should be be more than 5000")
    public long salary;

    /**
     *
     * @param name
     * @param salary
     */

    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
