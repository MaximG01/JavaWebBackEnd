package com.example.javawebfinal.Entity;

import com.example.javawebfinal.Request.UserRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name="User")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name= "first_name")
    private String FirstName;

    @Column(name= "last_name")
    private String LastName;

    public User (UserRequest userRequest){
        FirstName=userRequest.getFirstName();
        LastName=userRequest.getLastName();

    }


}
