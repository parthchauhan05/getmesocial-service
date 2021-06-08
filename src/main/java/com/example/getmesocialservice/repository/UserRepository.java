package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    public User getUser() {
        User user = new User("Parth", "Canada", 24, "google.com");
        return user;
    }
}
