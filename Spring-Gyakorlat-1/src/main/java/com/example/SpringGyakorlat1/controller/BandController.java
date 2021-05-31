package com.example.SpringGyakorlat1.controller;
import com.example.SpringGyakorlat1.model.Band;
import com.example.SpringGyakorlat1.service.BandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/band")
@RequiredArgsConstructor


public class BandController {

//    private final BandService bandService;
//
//    @PostMapping("/addband")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Band create(@RequestBody Band band) {
//        return bandService.save(band);
//    }
}
