package com.test.service;

import com.test.model.Ongoing;
import com.test.repository.OngoingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OngoingServiceIMPL implements OngoingService{

    @Autowired
    private OngoingRepository ongoingRepository;

    @Override
    public void registerOngoing(Ongoing ongoing){
        ongoingRepository.save(ongoing);
    }

    @Override
    public List<Ongoing> getAllOngoing(){
        return ongoingRepository.findAll();
    }

    public Ongoing getByName(String name){
        return null;
    }
}
