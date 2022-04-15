package com.test.service;

import com.test.model.Film;
import com.test.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceIMPL implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public void save(Film film) {
        filmRepository.save(film);
    }

    @Override
    public List<Film> getFilmByName(String name){
        return filmRepository.getAllByName(name);
    }

    public List<Film> getAll(){
        return filmRepository.findAll();
    }
}
