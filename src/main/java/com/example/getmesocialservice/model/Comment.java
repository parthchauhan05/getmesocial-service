package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;
import java.util.Date;

public class Comment {

    @Id
    private String id;
    private String photoId;
    private String createdBy;
    @Size(min = 5, message= "Comment must be more than 5 letters")
    private String message;
    private Date dateCreated;

    public Comment(String id, String photoId, String createdBy, String message, Date dateCreated) {
        this.id = id;
        this.photoId = photoId;
        this.createdBy = createdBy;
        this.message = message;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
