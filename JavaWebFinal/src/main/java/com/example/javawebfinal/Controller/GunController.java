package com.example.javawebfinal.Controller;


import com.example.javawebfinal.Entity.Gun;
import com.example.javawebfinal.Service.GunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guns/")
public class GunController {
    @Autowired
    GunService gunService; //Autowired not working for some reason...

 @GetMapping
    public List<Gun> getAllGuns()
    {
        return gunService.getAllGuns();
    }


}
