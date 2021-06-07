package com.example.SpringGyakorlat1.service;

import com.example.SpringGyakorlat1.model.Album;
import com.example.SpringGyakorlat1.model.Band;
import com.example.SpringGyakorlat1.repository.AlbumJpaRepository;
import com.example.SpringGyakorlat1.repository.BandJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class AlbumService {


    private final AlbumJpaRepository albumJpaRepository;
    private final BandJpaRepository bandJpaRepository;

    public void createNewAlbum(Album album) {
        String bandId = album.getBand().getId();
        Band band = bandJpaRepository.findById(bandId).orElse(null);
        albumJpaRepository.save(Album.builder()
                .albumName(album.getAlbumName())
                .releaseDate(album.getReleaseDate())
                .band(band)
                .build());
    }

    public Album updateAlbum(Album album, String id) {
        return albumJpaRepository.save(album.toBuilder().id(id).build()
        );
    }

    public void deleteAlbum(String id) {
        albumJpaRepository.deleteById(id);
    }

    public List<Album> findAllAlbum() {
        return albumJpaRepository.findAll();
    }

    public Optional<Album> findOne(String id) {
        return albumJpaRepository.findById(id);
    }

}
