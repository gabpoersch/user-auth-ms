package com.eldorado.handsonweek3.dto;

import com.eldorado.handsonweek3.enums.GenderEnum;
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

