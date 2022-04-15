package com.test.controller;

import com.test.model.Film;
import com.test.model.Ongoing;
import com.test.model.Seats;
import com.test.service.FilmService;
import com.test.service.OngoingService;
import com.test.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private OngoingService ongoingService;

    @Autowired
    private SeatsService seatsService;

    @PostMapping("/save")
    public void save(@RequestBody() Film film){
        filmService.save(film);
    }

    @GetMapping("/getFilmByName")
    public List<Film> getFilmByName(String name){
        return filmService.getFilmByName(name);
    }

    @GetMapping("/getAllFilm")
    public List<Film> getAll(){
        return filmService.getAll();
    }

    @PostMapping("/registerOngoing")
    public void registerOngoing(@RequestBody() Ongoing ongoing){
        ongoingService.registerOngoing(ongoing);
    }

    @GetMapping("/getAllOngoing")
    public List<Ongoing> getAllOngoing(){
        return ongoingService.getAllOngoing();
    }

}
