package com.test.repository;

import com.test.model.Ongoing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OngoingRepository extends JpaRepository<Ongoing, Integer> {

    @Query(value = "SELECT o from Ongoing o where o.film.name=:name")
    public Ongoing getByName(String name);
}
