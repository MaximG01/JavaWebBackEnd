package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.Gun;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class InformationTemplate {
    private long ID;
    private String THE_NAME;
    private String DESCRIPTION;
    private String COUNTRY_OF_ORIGIN;
    private String YEAR_MADE;
    private String CREATOR;
    private String RATE_OF_FIRE;
    private String BULLET_TYPE;
    private String THE_CLASS;  //since "Class" is also a relevant word in Coding, I had to add the "_" in front of it to avoid overloading the method
    private String FACT1;
    private String FACT2;
    private String Fact3;

    public InformationTemplate(Gun gun)
    {
        ID = gun.getId();
        THE_NAME = gun.getTHE_NAME();
        DESCRIPTION = gun.getDESCRIPTION();
        COUNTRY_OF_ORIGIN = gun.getCOUNTRY_OF_ORIGIN();
        YEAR_MADE = gun.getYEAR_MADE();
        CREATOR = gun.getCREATOR();
        RATE_OF_FIRE = gun.getRATE_OF_FIRE();
        BULLET_TYPE = gun.getBULLET_TYPE();
        THE_CLASS = gun.getTHE_CLASS();
        FACT1 = gun.getFACT1();
        FACT2 = gun.getFACT2();
        Fact3 = gun.getFACT3();

    }
}