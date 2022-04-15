package com.test.service;

import com.test.model.Film;

import java.util.List;

public interface FilmService {

    void save(Film film);

    List<Film> getFilmByName(String name);

    List<Film> getAll();
}
