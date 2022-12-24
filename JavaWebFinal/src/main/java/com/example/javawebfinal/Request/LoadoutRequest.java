package com.example.javawebfinal.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadoutRequest {
    @NotBlank
    private String primaryWeapon;
    @NotBlank
    private String secondaryWeapon;
    @NotBlank
    private String meleeWeapon;
}
