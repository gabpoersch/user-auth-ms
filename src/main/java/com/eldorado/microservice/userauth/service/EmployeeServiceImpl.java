package com.eldorado.microservice.userauth.service;

import com.eldorado.microservice.userauth.dto.EmployeeDTO;
import com.eldorado.microservice.userauth.dto.EmployeeUpdateDTO;
import com.eldorado.microservice.userauth.exception.EmployeeException;
import com.eldorado.microservice.userauth.mapper.EmployeeMapper;
import com.eldorado.microservice.userauth.model.Employee;
import com.eldorado.microservice.userauth.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDTO getEmployee(String username) throws EmployeeException {
        Optional<Employee> employeeOptional = employeeRepository.findByUsername(username);

        if (employeeOptional.isPresent()) {
            return EmployeeMapper.entityToDto(employeeOptional.get());
        } else {
            throw new EmployeeException(EmployeeException.USER_NOT_FOUND);
        }
    }


    @Override
    public EmployeeDTO updateEmployee(String username, EmployeeUpdateDTO employeeUpdateDTO) throws EmployeeException {
        Optional<Employee> employeeOptional = employeeRepository.findByUsername(username);

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setName(employeeUpdateDTO.getName());
            employee.setDocument(employeeUpdateDTO.getDocument());
            employee.setGender(employeeUpdateDTO.getGender());
            employee.setBirthdate(employeeUpdateDTO.getBirthdate());

            employeeRepository.save(employee);

            return EmployeeMapper.entityToDto(employee);
        } else {
            throw new EmployeeException(EmployeeException.USER_NOT_FOUND);
        }
    }

    @Override
    public void deleteEmployee(String username) throws EmployeeException {
        Optional<Employee> employeeOptional = employeeRepository.findByUsername(username);

        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
        } else {
            throw new EmployeeException(EmployeeException.USER_NOT_FOUND);
        }

    }
}
