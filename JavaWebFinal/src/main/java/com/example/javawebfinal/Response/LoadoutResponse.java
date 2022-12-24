package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.Loadout;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadoutResponse {
    private long id;
    private String PrimaryWeapon;
    private String SecondaryWeapon;
    private String MeleeWeapon;

    public LoadoutResponse(Loadout loadout){
        id=loadout.getId();
        PrimaryWeapon= loadout.getPrimaryWeapon();
        SecondaryWeapon=loadout.getSecondaryWeapon();
        MeleeWeapon=loadout.getMeleeWeapon();
    }
}
