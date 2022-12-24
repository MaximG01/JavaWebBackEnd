package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Loadout")
public class Loadout {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Gun 1 Primary
    //Gun 2 Secondary
    //Gun 3 Melee

}
