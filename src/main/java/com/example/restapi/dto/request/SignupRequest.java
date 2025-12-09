package com.example.restapi.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupRequest {

    @NotBlank(message = "username은 필수입니다")
    @Size(min = 4, max = 20, message = "username 길이는 4~20입니다")
    private String username;

    @NotBlank(message = "password는 필수입니다")
    private String password;

    @NotBlank(message = "email은 필수입니다")
    @Email(message = "이메일 형식이 아닙니다")
    private String email;

    private String name;
}
