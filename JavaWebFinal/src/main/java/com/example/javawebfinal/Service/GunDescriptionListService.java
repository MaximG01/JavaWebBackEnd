package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.GunDescriptionList;
import com.example.javawebfinal.Repository.GunDescriptionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GunDescriptionListService {
    @Autowired
    GunDescriptionListRepository gunDescriptionListRepository;

    public List<GunDescriptionList> getAllGunDescriptions()
    {
        return(List<GunDescriptionList>) gunDescriptionListRepository.findAll();
    }
}
