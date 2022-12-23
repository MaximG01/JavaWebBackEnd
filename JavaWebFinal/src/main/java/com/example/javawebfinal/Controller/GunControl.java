package com.example.javawebfinal.Controller;


import Service.GunService;
import com.example.javawebfinal.Entity.Gun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Component
@RestController
@RequestMapping("/guns/")
public class GunControl {


/*    @GetMapping("/gunInfo")
    public InformationTemplate getInfo() //@RequestParam(defaultValue="?") potentially use it to associate name with info? nah
    {
        return new InformationTemplate();
    }

*/
  //@Autowired
    GunService gunService;   //Autowired not working for some reason...

 @GetMapping
    public List<Gun> getAllGuns()
    {
        return gunService.getAllGuns();
    }


}
