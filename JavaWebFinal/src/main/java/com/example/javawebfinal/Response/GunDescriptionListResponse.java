package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.GunDescriptionList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GunDescriptionListResponse {
    private long Id;
    //private String THE_NAME;
    private String Description;
    private String CountryOfOrigin;
    private String YearMade;
    private String Creator;
    private String RateofFire;
    private String BulletType;
    private String TheClass;  //since "Class" is also a relevant word in Coding, I had to add the "_" in front of it to avoid overloading the method
    private String Fact1;
    private String Fact2;
    private String Fact3;

    public GunDescriptionListResponse(GunDescriptionList gunDescriptionList)
    {
        Id= gunDescriptionList.getId();

        //THE_NAME = gunDescriptionList.getTHE_NAME();
        Description = gunDescriptionList.getDescription();
        CountryOfOrigin = gunDescriptionList.getCountryOfOrigin();
        YearMade = gunDescriptionList.getYearMade();
        Creator = gunDescriptionList.getCreator();
        RateofFire = gunDescriptionList.getRateofFire();
        BulletType = gunDescriptionList.getBulletType();
        TheClass = gunDescriptionList.getTheClass();
        Fact1 = gunDescriptionList.getFact1();
        Fact2 = gunDescriptionList.getFact2();
        Fact3 = gunDescriptionList.getFact3();

    }
}