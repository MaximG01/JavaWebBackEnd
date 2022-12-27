package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.Loadout;
import com.example.javawebfinal.Entity.User;
import com.example.javawebfinal.Exception.ResourceNotFound;
import com.example.javawebfinal.Repository.LoadoutRepository;
import com.example.javawebfinal.Request.LoadoutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadoutService {
    @Autowired
    LoadoutRepository loadoutRepository;

    public List<Loadout> getAllLoadouts() {
        return (List<Loadout>) loadoutRepository.findAll();
    }

    public Loadout insertLoadout(LoadoutRequest loadoutRequest, User user){
        Loadout loadout = new Loadout(loadoutRequest);
        loadout.setUser(user);
        return loadoutRepository.save(loadout);
    }

    public Loadout updateLoadout (long loadoutId, LoadoutRequest loadoutRequest, User user){
        Loadout loadout = new Loadout(loadoutRequest);
        loadout.setUser(user);
        loadout.setId(loadoutId);

        return loadoutRepository.save(loadout);

    }

    public void deleteLoadout(long loadoutId){
        loadoutRepository.findById(loadoutId).orElseThrow(()->new ResourceNotFound("Loadout not found."));
        loadoutRepository.deleteById(loadoutId);
    }
}
