package com.example.SpringGyakorlat1.controller;

import com.example.SpringGyakorlat1.model.Album;
import com.example.SpringGyakorlat1.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class AlbumController {

    private final AlbumService albumService;

    @PostMapping("/album/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewAlbum(@RequestBody Album album) {
      albumService.createNewAlbum(album);
    }

    @PostMapping("/album/{id}")
    public Album updateAlbum(@RequestBody Album album, @PathVariable String id) {
        return albumService.updateAlbum(album, id);
    }

    @DeleteMapping("/album/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAlbum(@PathVariable String id) {
        albumService.deleteAlbum(id);
    }

    @GetMapping("/album")
    public List<Album> findAllAlbum() {
        return albumService.findAllAlbum();
    }


    @GetMapping("/album/{id}")
    public Optional<Album> findOne(@PathVariable String id) {
        return albumService.findOne(id);
    }

}
