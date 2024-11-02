package com.myblog_rest_api.myblog_rest_api.payload;


import lombok.Data;

@Data
public class LoginDto {

    private String usernameOrEmail;
    private String password;

}
