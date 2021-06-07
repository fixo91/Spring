package com.example.SpringGyakorlat1.controller;

import com.example.SpringGyakorlat1.model.Album;
import com.example.SpringGyakorlat1.model.Band;
import com.example.SpringGyakorlat1.service.BandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor


public class BandController {

    private final BandService bandService;

    @PostMapping("/band/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewBand(@RequestBody Band band) {
        bandService.createNewBand(band);
    }

    @PostMapping("/band/{id}")
    public Band updateBand(@RequestBody Band band, @PathVariable String id) {
        return bandService.updateBand(band, id);
    }

    @DeleteMapping("/band/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBand(@PathVariable String id) {
        bandService.deleteBand(id);
    }

    @GetMapping("/band")
    public List<Band> findAllBand() {
        return bandService.findAllBand();
    }

    @GetMapping("/band/{id}")
    public Optional<Band> findOne(@PathVariable String id) {
        return bandService.findOne(id);
    }
}
