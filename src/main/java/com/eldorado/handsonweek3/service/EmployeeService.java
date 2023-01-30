package com.eldorado.handsonweek3.service;


import com.eldorado.handsonweek3.dto.EmployeeDTO;
import com.eldorado.handsonweek3.dto.EmployeeUpdateDTO;
import com.eldorado.handsonweek3.exception.EmployeeException;

public interface EmployeeService {

    EmployeeDTO getEmployee(String id) throws EmployeeException;

    EmployeeDTO updateEmployee(String id, EmployeeUpdateDTO employeeUpdateDTO) throws EmployeeException;

    void deleteEmployee(String id) throws EmployeeException;

}
