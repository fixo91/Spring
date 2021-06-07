package com.example.SpringGyakorlat1.repository;


import com.example.SpringGyakorlat1.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackJpaRepository extends JpaRepository<Track, String> {

    List<Track> findByAlbumAlbumNameContaining(String albumName);
    Track findByTrackLengthContaining(String trackLength);




}
