package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.Guns;
import com.example.javawebfinal.Repository.GunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GunService {
    @Autowired
    GunRepository gunRepository;

    public List<Guns> getAllGuns()
    {
        return(List<Guns>) gunRepository.findAll();
    }
}
