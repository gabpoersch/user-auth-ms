package com.eldorado.microservice.userauth.controller;

import com.eldorado.microservice.userauth.dto.EmployeeDTO;
import com.eldorado.microservice.userauth.dto.EmployeeUpdateDTO;
import com.eldorado.microservice.userauth.exception.EmployeeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "EmployeeController", description = "Operations related to employees.")
@RequestMapping("/user")
public interface EmployeeController {

    @ApiOperation(value = "Get details of an employee", response = EmployeeDTO.class)
    @GetMapping("/{username}")
    ResponseEntity<EmployeeDTO> getEmployee(@PathVariable("username") String username) throws EmployeeException;

    @ApiOperation(value = "Update details of an employee", response = EmployeeDTO.class)
    @PutMapping("/{username}/update")
    ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("username") String username, @RequestBody EmployeeUpdateDTO employeeUpdateDTO) throws EmployeeException;

    @ApiOperation(value = "Delete an employee")
    @DeleteMapping("/{username}/delete")
    ResponseEntity<Void> deleteEmployee(@PathVariable("username") String username) throws EmployeeException;

}
