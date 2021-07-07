package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;
import java.util.Date;

public class Album {
    @Id
    private String id;
    @Size(max=10, message= "Name must be less than 10 letters")
    private String name;
    @ValidName
    private String createdBy;
    private String coverPhotoUrl;
    private Date dateCreated;


    public Album(String id, String name, String createdBy, String coverPhotoUrl, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.coverPhotoUrl = coverPhotoUrl;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
