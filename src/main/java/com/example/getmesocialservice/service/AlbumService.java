package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album){
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public Optional<Album> getAlbumById(String id) {
        return albumRepository.findById(id);
    }

    public void deleteAlbum(String id) {
        albumRepository.deleteById(id);
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }
}
