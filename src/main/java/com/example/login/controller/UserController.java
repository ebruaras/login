package com.example.login.controller;

import com.example.login.entity.Status;
import com.example.login.entity.User;
import com.example.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public Status login(@Valid @RequestBody User user){
        List<User> users=userRepository.findAll();
        for(User other: users){
            if(other.getUsername().equals(user.getUsername()) && other.getPassword().equals(user.getPassword())){
                return Status.DOGRU;
            }
     }
        return Status.YANLIS;
    }

}
