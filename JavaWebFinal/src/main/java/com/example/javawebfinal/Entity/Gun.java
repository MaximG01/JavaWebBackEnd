package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter

@Table(name = "Guns")
public class Gun
{
    @Id @GeneratedValue
    private long id;

    @Column(name= "Description")
    private String Description;

    @Column(name= "Country of Origin")
    private String Country_of_Origin;

    @Column(name= "Year Made")
    private String Year_Made;

    @Column(name= "Creator")
    private String Creator;

    @Column(name= "Rate of Fire")
    private String Rate_of_Fire;

    @Column(name= "Bullet type")
    private String Bullet_Type;

    @Column(name= "Class")
    private String _Class;

    @Column(name= "Fact 1")
    private String Fact1;

    @Column(name= "Fact 2")
    private String Fact2;

    @Column(name= "Fact 3")
    private String Fact3;

}
