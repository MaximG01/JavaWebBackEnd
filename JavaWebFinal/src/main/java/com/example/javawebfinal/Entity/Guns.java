package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Guns")
public class Guns {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name= "name")
        private String TheName;

        @Column(name= "gundescriptionlist_Id")
        private long GunDescriptionListId;

}
