package com.example.SpringGyakorlat1.controller;

import com.example.SpringGyakorlat1.model.Track;
import com.example.SpringGyakorlat1.service.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor


public class TrackController {

    private final TrackService trackService;

    @PostMapping("/track/create/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewTrack(@RequestBody Track track, @PathVariable String id) {
        trackService.createNewTrack(track, id);
    }

    @PostMapping("/track/{id}")
    public Track updateTrack(@RequestBody Track track, @PathVariable String id) {
        return trackService.updateTrack(track, id);
    }

    @DeleteMapping("/track/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrack(@PathVariable String id) {
        trackService.deleteTrack(id);
    }

    @GetMapping("/track")
    public List<Track> findAllTrack() {
        return trackService.findAllTrack();
    }

    @GetMapping("/track/{id}")
    public Optional<Track> findOne(@PathVariable String id) {
        return trackService.findOne(id);
    }
}