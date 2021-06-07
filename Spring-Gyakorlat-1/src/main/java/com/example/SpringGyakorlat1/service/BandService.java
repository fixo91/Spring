package com.example.SpringGyakorlat1.service;

import com.example.SpringGyakorlat1.model.Band;
import com.example.SpringGyakorlat1.repository.BandJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class BandService {

    private final BandJpaRepository bandJpaRepository;


    public Band createNewBand(Band band) {
        return bandJpaRepository.save(band.toBuilder().build()
        );
    }

    public Band updateBand(Band band, String id) {
        return bandJpaRepository.save(band.toBuilder().id(id).build()
        );
    }

    public void deleteBand(String id) {
        bandJpaRepository.deleteById(id);
    }

    public List<Band> findAllBand() {
        return bandJpaRepository.findAll();
    }

    public Optional<Band> findOne(String id) {
        return bandJpaRepository.findById(id);
    }
}
