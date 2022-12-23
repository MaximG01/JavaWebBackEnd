package com.example.javawebfinal.Repository;


import com.example.javawebfinal.Entity.Gun;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;




@Repository
public interface GunRepository extends CrudRepository<Gun, Long>  //<EntityName, IdType>
{

}
