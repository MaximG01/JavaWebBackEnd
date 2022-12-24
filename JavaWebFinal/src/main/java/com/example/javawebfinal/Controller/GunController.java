package com.example.javawebfinal.Controller;


import com.example.javawebfinal.Entity.Gun;
import com.example.javawebfinal.Response.InformationTemplate;
import com.example.javawebfinal.Service.GunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/guns/")
public class GunController {
    @Autowired
    GunService gunService; //Autowired not working for some reason...

 @GetMapping
    public List<InformationTemplate> getAllGuns()
    {
        List<Gun> guns = gunService.getAllGuns();

        List<InformationTemplate> informationTemplate = new ArrayList<>();
        guns.forEach(gun -> {
            informationTemplate.add(new InformationTemplate(gun));
        });
        return informationTemplate;
    }
}
