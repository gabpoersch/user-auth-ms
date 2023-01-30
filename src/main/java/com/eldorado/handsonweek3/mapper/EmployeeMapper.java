package com.eldorado.handsonweek3.mapper;

import com.eldorado.handsonweek3.dto.EmployeeDTO;
import com.eldorado.handsonweek3.dto.EmployeeSaveDTO;
import com.eldorado.handsonweek3.model.Employee;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeMapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static EmployeeDTO entityToDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public static Employee dtoToEntity(EmployeeDTO employeeDto) {
        if (employeeDto == null) {
            return null;
        }
        return modelMapper.map(employeeDto, Employee.class);
    }

    public static EmployeeSaveDTO entityToSaveDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        return modelMapper.map(employee, EmployeeSaveDTO.class);
    }

    public static Employee saveDtoToEntity(EmployeeSaveDTO employeeSaveDTO) {
        if (employeeSaveDTO == null) {
            return null;
        }
        return modelMapper.map(employeeSaveDTO, Employee.class);
    }
}
