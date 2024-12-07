package com.JWT.example.Controllers;

import com.JWT.example.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;


    //http://localhost:8080/home/users
    @GetMapping("/users")
    public List getUser(){
        System.out.println("Getting Users");
        return userService.getUsers();

    }

}
