package com.example.javawebfinal.Repository;


import com.example.javawebfinal.Entity.GunDescriptionList;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;




@Repository
public interface GunDescriptionListRepository extends CrudRepository<GunDescriptionList, Long>  //<EntityName, IdType>
{

}
