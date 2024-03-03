package com.rayhansajal.Employee_Management_System_SpringBoot3.mapper;

import com.rayhansajal.Employee_Management_System_SpringBoot3.dto.EmployeeDto;
import com.rayhansajal.Employee_Management_System_SpringBoot3.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );


    }
    public static Employee mapTOEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
