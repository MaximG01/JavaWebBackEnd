package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.Loadout;
import com.example.javawebfinal.Repository.LoadoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadoutService {
    @Autowired
    LoadoutRepository loadoutRepository;

    public List<Loadout> getAllLoadouts(){
        return (List<Loadout>) loadoutRepository.findAll();
    }
}
