package com.example.SpringGyakorlat1.service;

import com.example.SpringGyakorlat1.model.Band;
import com.example.SpringGyakorlat1.repository.BandJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class BandService {

    private final BandJpaRepository bandJpaRepository;

//    public Band save(Band band) {
//
//        return bandJpaRepository.save(band.toBuilder()
//                .id(UUID.randomUUID().toString())
//                .createdAt(LocalDateTime.now())
//                .build()
//        );
//    }
}
