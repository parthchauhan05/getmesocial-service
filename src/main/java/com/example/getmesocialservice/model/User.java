package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

public class User {

    private String name;
    private String email;
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
