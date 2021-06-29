package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {
    @Autowired private AlbumService albumService;

    @GetMapping
    public List<Album> getAllAlbum() {
        return albumService.getAllAlbum();
    }

    @GetMapping("/album")
    public Optional<Album> getAlbumById(@RequestParam(name = "id") String id){
        return albumService.getAlbumById(id);
    }

    @PostMapping
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album) {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "id") String id) {
        albumService.deleteAlbum(id);
    }
}
