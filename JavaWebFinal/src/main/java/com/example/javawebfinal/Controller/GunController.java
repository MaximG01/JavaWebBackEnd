package com.example.javawebfinal.Controller;


import com.example.javawebfinal.Entity.Guns;
import com.example.javawebfinal.Entity.GunDescriptionList;
import com.example.javawebfinal.Entity.Loadout;
import com.example.javawebfinal.Entity.User;
import com.example.javawebfinal.Repository.LoadoutRepository;
import com.example.javawebfinal.Request.LoadoutRequest;
import com.example.javawebfinal.Request.UserRequest;
import com.example.javawebfinal.Response.GunDescriptionListResponse;
import com.example.javawebfinal.Response.GunResponse;
import com.example.javawebfinal.Response.LoadoutResponse;
import com.example.javawebfinal.Response.UserResponse;
import com.example.javawebfinal.Service.GunDescriptionListService;
import com.example.javawebfinal.Service.GunService;
import com.example.javawebfinal.Service.LoadoutService;
import com.example.javawebfinal.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//Take off /
@RestController
@CrossOrigin("*")
@RequestMapping("/gunLocker")
public class GunController {
    @Autowired
    GunDescriptionListService gunDescriptionListService;

 @GetMapping("/descriptions/{id}")
    public List<GunDescriptionListResponse> getAllGunDescriptions()
    {
        List<GunDescriptionList> gunDescriptionLists = gunDescriptionListService.getAllGunDescriptions();

        List<GunDescriptionListResponse> gunDescriptionListResponse = new ArrayList<>();
        gunDescriptionLists.forEach(gunDescriptionList -> {
            gunDescriptionListResponse.add(new GunDescriptionListResponse(gunDescriptionList));
        });
        return gunDescriptionListResponse;


    }

    @Autowired
    GunService gunService;
    @GetMapping("/guns")
    public List<GunResponse> getAllGuns(@RequestParam(required = false)Long id)
    {
        List<Guns> guns = gunService.getAllGuns();

        List<GunResponse> gunResponse = new ArrayList<>();
        guns.forEach(gun -> {
            gunResponse.add(new GunResponse(gun));
        });
        return gunResponse;
    }

    @Autowired
    UserService userService;
    @GetMapping("/User")
    public List<UserResponse> getAllUsers()
    {
        List<User> user = userService.getAllUsers();

        List<UserResponse> userResponse = new ArrayList<>();
        user.forEach(user1 -> {
            userResponse.add(new UserResponse(user1));
        });
        return userResponse;
    }
    @PostMapping("/User")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse addUser(@Valid @RequestBody UserRequest userRequest){
        User user = userService.insertUser(userRequest);
        return new UserResponse(user);
    }

    @Autowired
    LoadoutService loadoutService;


    @GetMapping("/Loadout")
    public List<LoadoutResponse> getAllLoadouts()
    {
        List<Loadout> loadout = loadoutService.getAllLoadouts();

        List<LoadoutResponse> loadoutResponse = new ArrayList<>();
        loadout.forEach(loadout1 -> {
            loadoutResponse.add(new LoadoutResponse(loadout1));
        });
        return loadoutResponse;
    }
    @PostMapping("/Loadout")
    @ResponseStatus(HttpStatus.CREATED)
    public LoadoutResponse addLoadout(@Valid @RequestBody LoadoutRequest loadoutRequest){
        Loadout loadout = loadoutService.insertLoadout(loadoutRequest);
        return new LoadoutResponse(loadout);
    }
    @Autowired
    private LoadoutRepository loadoutRepository;
    @PutMapping("/Loadout/{id}")
    public Loadout updateLoadout(@PathVariable long loadoutId, @Valid @RequestBody LoadoutRequest loadoutRequest){
        Loadout loadoutToBeUpdated = new Loadout(loadoutRequest);
        loadoutToBeUpdated.setId(loadoutId);
        return loadoutRepository.save(loadoutToBeUpdated);
    }

    @DeleteMapping("/Loadout/{id}")
    public void deleteLoadout(@PathVariable long id){
        loadoutService.deleteLoadout(id);
    }
}
