package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumRepository {
    private List<Album> albums = new ArrayList<>();
    public List<Album> getAllAlbum() {
        return albums;
    }

    public Album getAlbum(int albumId) {
        for(Album a: albums){
            if(a.getAlbumId() == albumId){
                return a;
            }
        }
        return null;
    }

    public Album addAlbum(Album album) {
        album.setAlbumId(albums.size() + 1);
        albums.add(album);
        return album;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a: albums){
            if(a.getAlbumId() == albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album a: albums){
            if(a.getAlbumId() == albumId){
                deletedAlbum = a;
                albums.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
