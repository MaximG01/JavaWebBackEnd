package com.example.javawebfinal.Entity;

import com.example.javawebfinal.Request.LoadoutRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name="Loadout")
public class Loadout {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "primary_weapon")
    private String PrimaryWeapon;

    @Column(name= "secondary_weapon")
    private String SecondaryWeapon;

    @Column(name= "melee_weapon")
    private String MeleeWeapon;

    //potentially a many to many with Guns/GunDescriptionList

    public Loadout(LoadoutRequest loadoutRequest)
    {
        PrimaryWeapon=loadoutRequest.getPrimaryWeapon();
        SecondaryWeapon=loadoutRequest.getSecondaryWeapon();
        MeleeWeapon=loadoutRequest.getMeleeWeapon();

    }

}
