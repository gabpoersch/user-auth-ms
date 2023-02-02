package com.eldorado.microservice.userauth.config.auth;

import com.eldorado.microservice.userauth.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String password;
    private String name;
    private String document;
    private GenderEnum gender;
    private String birthdate;

}
