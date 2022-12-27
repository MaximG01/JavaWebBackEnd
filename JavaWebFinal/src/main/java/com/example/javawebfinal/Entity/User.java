package com.example.javawebfinal.Entity;

import com.example.javawebfinal.Request.UserRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name="Userz")  //"User" does not show up in the table
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name= "first_name")
    private String FirstName;

    @Column(name= "last_name")
    private String LastName;
    /*@Column(name="Loadout_id")
    private long LoadoutId;*/
    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)  //no delete added to user yet...
    private List<Loadout> loadoutList;

    public User (UserRequest userRequest){
        FirstName=userRequest.getFirstName();
        LastName=userRequest.getLastName();
        loadoutList=userRequest.getLoadoutList();

    }


}
