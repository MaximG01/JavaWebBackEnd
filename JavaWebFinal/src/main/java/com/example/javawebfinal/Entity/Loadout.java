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

    @Column(name= "weapon")
    private String Weapon;




    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    //potentially a many to many with Guns/GunDescriptionList

    public Loadout(LoadoutRequest loadoutRequest)
    {
        Weapon=loadoutRequest.getWeapon();


    }

}
