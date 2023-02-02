package com.eldorado.microservice.userauth.service;


import com.eldorado.microservice.userauth.dto.EmployeeDTO;
import com.eldorado.microservice.userauth.dto.EmployeeUpdateDTO;
import com.eldorado.microservice.userauth.exception.EmployeeException;

public interface EmployeeService {

    EmployeeDTO getEmployee(String id) throws EmployeeException;

    EmployeeDTO updateEmployee(String id, EmployeeUpdateDTO employeeUpdateDTO) throws EmployeeException;

    void deleteEmployee(String id) throws EmployeeException;

}
