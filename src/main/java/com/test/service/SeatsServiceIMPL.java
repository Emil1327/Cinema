package com.test.service;

import com.test.model.Seats;
import com.test.model.Status;
import com.test.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatsServiceIMPL implements SeatsService{

    @Autowired
    private SeatsRepository seatsRepository;

    public void add(Seats seats){
        Seats seats1 = new Seats();
        seats1=seats;
        seats1.setStatus(Status.FREE);
        seatsRepository.save(seats1);
    }
}
