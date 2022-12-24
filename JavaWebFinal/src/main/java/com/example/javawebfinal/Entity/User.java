package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name= "first_name")
    private String FirstName;

    @Column(name= "last_name")
    private String LastName;


}
