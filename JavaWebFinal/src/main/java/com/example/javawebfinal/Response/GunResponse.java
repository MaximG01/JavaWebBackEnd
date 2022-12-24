package com.example.javawebfinal.Response;

import com.example.javawebfinal.Entity.GunDescriptionList;
import com.example.javawebfinal.Entity.Guns;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GunResponse {


    private long Id;
    private String Name;
    private GunDescriptionList gunDescriptionList;

    public GunResponse (Guns guns)
    {
        Id = guns.getId();
        Name = guns.getTheName();
        gunDescriptionList = guns.getGunDescriptionList();
    }
}
