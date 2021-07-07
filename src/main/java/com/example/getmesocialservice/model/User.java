package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {


    private String name;
    @Email(message = "Please Enter a valid E-mail Address")
    private String email;
    @NotEmpty(message = "Please provide profile picture")
    private String profilePicUrl;

    @Id
    private String id;


    public User(String name, String email, String profilePicUrl, String id) {
        this.name = name;
        this.email = email;
        this.profilePicUrl = profilePicUrl;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
