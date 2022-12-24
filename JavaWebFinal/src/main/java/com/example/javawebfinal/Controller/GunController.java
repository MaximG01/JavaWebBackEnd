package com.example.javawebfinal.Controller;


import com.example.javawebfinal.Entity.Guns;
import com.example.javawebfinal.Entity.GunDescriptionList;
import com.example.javawebfinal.Response.GunDescriptionListResponse;
import com.example.javawebfinal.Response.GunResponse;
import com.example.javawebfinal.Service.GunDescriptionListService;
import com.example.javawebfinal.Service.GunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gunLocker/")
public class GunController {
    @Autowired
    GunDescriptionListService gunDescriptionListService;

 @GetMapping("/descriptions/")
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
    @GetMapping("/guns/")
    public List<GunResponse> getAllGuns()
    {
        List<Guns> guns = gunService.getAllGuns();

        List<GunResponse> gunResponse = new ArrayList<>();
        guns.forEach(gun -> {
            gunResponse.add(new GunResponse(gun));
        });
        return gunResponse;
    }
}
