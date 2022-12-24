package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter

@Table(name = "GUN_DESCRIPTION_LIST")
public class GunDescriptionList
{
    @Id @GeneratedValue
    private long Id;

    @Column(name= "description")
    private String Description;

    @Column(name= "country_of_origin")
    private String CountryOfOrigin;

    @Column(name= "year_made")
    private String YearMade;

    @Column(name= "creator")
    private String Creator;

    @Column(name= "rate_of_fire")
    private String RateofFire;

    @Column(name= "bullet_type")
    private String BulletType;

    @Column(name= "class")
    private String TheClass;

    @Column(name= "fact1")
    private String Fact1;

    @Column(name= "fact2")
    private String Fact2;

    @Column(name= "fact3")
    private String Fact3;


}
