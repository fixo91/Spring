package com.example.SpringGyakorlat1.service;

import com.example.SpringGyakorlat1.model.Album;
import com.example.SpringGyakorlat1.model.MusicProvider;
import com.example.SpringGyakorlat1.model.Track;
import com.example.SpringGyakorlat1.repository.MusicProviderJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MusicProviderService {

    public final MusicProviderJpaRepository musicProviderJpaRepository;

    public MusicProvider createNewMusicProvider(MusicProvider musicprovider) {
        return musicProviderJpaRepository.save(musicprovider.toBuilder().build()
        );
    }

    public MusicProvider updateMusicProvider(MusicProvider musicprovider, String id) {
        return musicProviderJpaRepository.save(musicprovider.toBuilder().id(id).build()
        );
    }

    public void deleteMusicProvider(String id) {
        musicProviderJpaRepository.deleteById(id);
    }

    public List<MusicProvider> findAllMusicProvider() {
        return musicProviderJpaRepository.findAll();
    }

    //findOne - Paraméteren kap egy együttest, visszaad egy listát amiben musicproviderok vannak

    public Optional<MusicProvider> findOne(String id) {
        return musicProviderJpaRepository.findById(id);
    }


}
