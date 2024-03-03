package com.rayhansajal.Employee_Management_System_SpringBoot3.repository;

import com.rayhansajal.Employee_Management_System_SpringBoot3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
}
