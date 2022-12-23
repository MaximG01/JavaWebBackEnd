package com.example.javawebfinal.Repository;


import com.example.javawebfinal.Entity.Gun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface GunRepository extends CrudRepository<Gun, Long>  //<EntityName, IdType>
{

}
