package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.GunDescriptionList;
import com.example.javawebfinal.Exception.ResourceNotFound;
import com.example.javawebfinal.Repository.GunDescriptionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GunDescriptionListService {
    @Autowired
    GunDescriptionListRepository gunDescriptionListRepository;

    public GunDescriptionList getGunDescriptions(long Id)
    {
        GunDescriptionList gunDescriptionList = gunDescriptionListRepository.findById(Id).orElseThrow(()->new ResourceNotFound("course id not found"));
        return gunDescriptionList;
    }

    /*  public Course getCourse(long courseId)
    {
        Course course = courseRepository.findById(courseId).orElseThrow(()->new ResourceNotFoundException("course id not found"));
        return course;
    }
  */
}
