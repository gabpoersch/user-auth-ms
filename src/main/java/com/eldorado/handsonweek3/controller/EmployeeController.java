package com.eldorado.handsonweek3.controller;

import com.eldorado.handsonweek3.dto.EmployeeDTO;
import com.eldorado.handsonweek3.dto.EmployeeUpdateDTO;
import com.eldorado.handsonweek3.exception.EmployeeException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
public interface EmployeeController {

    @GetMapping("/{username}")
    ResponseEntity<EmployeeDTO> getEmployee(@PathVariable("username") String username) throws EmployeeException;

    @PutMapping("/{username}/update")
    ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("username") String username, @RequestBody EmployeeUpdateDTO employeeUpdateDTO) throws EmployeeException;

    @DeleteMapping("/{username}/delete")
    ResponseEntity<Void> deleteEmployee(@PathVariable("username") String username) throws EmployeeException;

}
