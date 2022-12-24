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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "Name")
    private String THE_NAME;

    @Column(name= "Description")
    private String DESCRIPTION;

    @Column(name= "Country of Origin")
    private String COUNTRY_OF_ORIGIN;

    @Column(name= "Year Made")
    private String YEAR_MADE;

    @Column(name= "Creator")
    private String CREATOR;

    @Column(name= "Rate of Fire")
    private String RATE_OF_FIRE;

    @Column(name= "Bullet type")
    private String BULLET_TYPE;

    @Column(name= "Class")
    private String THE_CLASS;

    @Column(name= "Fact 1")
    private String FACT1;

    @Column(name= "Fact 2")
    private String FACT2;

    @Column(name= "Fact 3")
    private String FACT3;


}
