package com.test.repository;

import com.test.model.Film;
import com.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(value = "SELECT f from Film f where f.name=:name")
    public Film getFilmByName(String name);

    List<Film> getAllByName(String name);
}
