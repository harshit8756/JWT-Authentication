package com.JWT.example.Services;

import com.JWT.example.Entities.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    //default constructor
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Harshit Yadav" , "abc1@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Kaushik Pratik" , "abc2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sachin Kumar" , "abc3@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mayank Singh" , "abc4@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ashutosh Mishra" , "abc5@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Nitish Singh" , "abc6@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
