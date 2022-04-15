package com.test.service;

import com.test.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallServiceIMPL implements HallService {

    @Autowired
    private HallRepository hallRepository;
}
