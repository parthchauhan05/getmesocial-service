package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired private PhotoService photoService;

    @GetMapping
    public List<Photo> getAllPhoto() {
        return photoService.getAllPhoto();
    }

    @GetMapping("/photo")
    public Optional<Photo> getPhotoById(@RequestParam(name = "id") String id){
        return photoService.getPhotoById(id);
    }

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo) {
        return photoService.savePhoto(photo);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo) {
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id") String id) {
        photoService.deletePhoto(id);
    }
}
