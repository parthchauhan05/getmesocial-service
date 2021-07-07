package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Photo {
    @Id
    private String id;
    private String albumId;
    @ValidName
    private String createdBy;
    private String photoUrl;
    private Date dateCreated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Photo(String id, String albumId, String createdBy, String photoUrl, Date dateCreated) {
        this.id = id;
        this.albumId = albumId;
        this.createdBy = createdBy;
        this.photoUrl = photoUrl;
        this.dateCreated = dateCreated;
    }
}
