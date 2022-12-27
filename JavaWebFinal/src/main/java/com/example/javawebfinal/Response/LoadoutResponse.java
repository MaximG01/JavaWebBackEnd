package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.Loadout;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadoutResponse {
    private long id;
    private String Weapon;


    public LoadoutResponse(Loadout loadout){
        id=loadout.getId();
        Weapon= loadout.getWeapon();
    }
}
