package com.example.javawebfinal.Request;

import com.example.javawebfinal.Entity.Loadout;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class UserRequest {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private List<Loadout> loadoutList;
}
