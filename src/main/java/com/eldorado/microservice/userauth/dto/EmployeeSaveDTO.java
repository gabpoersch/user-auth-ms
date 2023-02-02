package com.eldorado.microservice.userauth.dto;

import com.eldorado.microservice.userauth.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeSaveDTO {
    String username;
    String password;
    String name;
    String document;
    GenderEnum gender;
    String birthdate;
}

