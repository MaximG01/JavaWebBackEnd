package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private long Id;
    private String FirstName;
    private String LastName;


    public UserResponse (User user)
    {
        Id= user.getId();
        FirstName= user.getFirstName();
        LastName= user.getLastName();
    }
}
