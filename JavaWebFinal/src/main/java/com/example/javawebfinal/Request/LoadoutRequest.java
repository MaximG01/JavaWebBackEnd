package com.example.javawebfinal.Request;

import com.example.javawebfinal.Entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadoutRequest {
    @NotBlank
    private String weapon;

    private Long userid;



}
