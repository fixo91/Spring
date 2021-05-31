//package com.example.SpringGyakorlat1.service;
//
//import com.example.SpringGyakorlat1.model.Album;
//import com.example.SpringGyakorlat1.model.Band;
//import com.example.SpringGyakorlat1.repository.AlbumJpaRepository;
//import lombok.Builder;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Service
//@RequiredArgsConstructor
//
//public class AlbumService {
//
//
//    private final AlbumJpaRepository albumJpaRepository;
//
//    public Album createAlbum(Band band) {
//
//        return albumJpaRepository.save(album.toBuilder()
//                .uuid(UUID.randomUUID())
//                .createdAt(LocalDateTime.now())
//                .build()
//        );
//    }
//}
