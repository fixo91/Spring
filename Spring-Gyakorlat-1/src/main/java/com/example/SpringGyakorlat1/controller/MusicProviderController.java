package com.example.SpringGyakorlat1.controller;


import com.example.SpringGyakorlat1.model.MusicProvider;
import com.example.SpringGyakorlat1.service.MusicProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class MusicProviderController {

    private final MusicProviderService musicProviderService;

    @PostMapping("/musicprovider/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewMusicProvider(@RequestBody MusicProvider musicProvider) {
        musicProviderService.createNewMusicProvider(musicProvider);
    }

    @PostMapping("/musicprovider/{id}")
    public MusicProvider updateMusicProvider(@RequestBody MusicProvider musicProvider, @PathVariable String id) {
        return musicProviderService.updateMusicProvider(musicProvider, id);
    }

    @DeleteMapping("/musicprovider/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMusicProvider(@PathVariable String id) {
        musicProviderService.deleteMusicProvider(id);
    }

    @GetMapping("/musicprovider")
    public List<MusicProvider> findAllMusicProvider() {
        return musicProviderService.findAllMusicProvider();
    }


    @GetMapping("/musicprovider/{id}")
    public Optional<MusicProvider> findOne(@PathVariable String id) {
        return musicProviderService.findOne(id);
    }

}
