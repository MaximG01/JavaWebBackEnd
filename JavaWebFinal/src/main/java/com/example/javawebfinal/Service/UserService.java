package com.example.javawebfinal.Service;

import com.example.javawebfinal.Entity.User;
import com.example.javawebfinal.Exception.ResourceNotFound;
import com.example.javawebfinal.Repository.UserRepository;
import com.example.javawebfinal.Request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        return (List<User>) userRepository.findAll();
    }

    public User insertUser (UserRequest userRequest){
        return userRepository.save(new User(userRequest));
    }
    public User getUser(Long userId)
    {

        return userRepository.findById(userId).orElseThrow((()->new ResourceNotFound("User id not found")));
    }

}
