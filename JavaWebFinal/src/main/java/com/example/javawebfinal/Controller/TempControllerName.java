package com.example.javawebfinal.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Guns/")
public class TempControllerName {


    @GetMapping("/ak47")
    public  String ak47Info()
    {
        return "Hello World.";
    }

}
