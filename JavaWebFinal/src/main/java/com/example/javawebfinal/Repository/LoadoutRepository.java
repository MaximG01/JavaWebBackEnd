package com.example.javawebfinal.Repository;

import com.example.javawebfinal.Entity.Loadout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadoutRepository extends CrudRepository<Loadout, Long> {
}
