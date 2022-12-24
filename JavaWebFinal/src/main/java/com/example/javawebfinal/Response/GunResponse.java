package com.example.javawebfinal.Response;

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
    private long GunDescriptionListId;

    public GunResponse (Guns guns)
    {
        Id = guns.getId();
        Name = guns.getTheName();
        GunDescriptionListId = guns.getGunDescriptionListId();
    }
}
