package com.example.javawebfinal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "GUNS")
public class Guns {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name= "the_name")
        private String TheName;

        @OneToOne
        private GunDescriptionList gunDescriptionList;

}
