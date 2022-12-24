package com.example.javawebfinal.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserRequest {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
}
