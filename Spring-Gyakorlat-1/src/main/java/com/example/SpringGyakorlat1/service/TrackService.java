package com.example.SpringGyakorlat1.service;

import com.example.SpringGyakorlat1.model.Album;
import com.example.SpringGyakorlat1.model.Track;
import com.example.SpringGyakorlat1.repository.AlbumJpaRepository;
import com.example.SpringGyakorlat1.repository.TrackJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class TrackService {

    private final TrackJpaRepository trackJpaRepository;
    private final AlbumJpaRepository albumJpaRepository;


    public Track createNewTrack(Track track, String id) {
        return trackJpaRepository.save(track.toBuilder()
                .album(albumJpaRepository.getById(id))
                .build()
        );
    }

    public Track updateTrack(Track track, String id) {
        return trackJpaRepository.save(track.toBuilder().id(id).build()
        );
    }

    public void deleteTrack(String id) {
        trackJpaRepository.deleteById(id);
    }

    public List<Track> findAllTrack() {
        return trackJpaRepository.findAll();
    }

    public Optional<Track> findOne(String id) {
        return trackJpaRepository.findById(id);
    }

}
