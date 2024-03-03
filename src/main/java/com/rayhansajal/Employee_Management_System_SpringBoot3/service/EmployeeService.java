package com.rayhansajal.Employee_Management_System_SpringBoot3.service;

import com.rayhansajal.Employee_Management_System_SpringBoot3.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);
    void deleteEmployee(Long employeeId);
}
