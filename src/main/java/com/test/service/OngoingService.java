package com.test.service;

import com.test.model.Ongoing;

import java.util.List;

public interface OngoingService {

    List<Ongoing> getAllOngoing();

    void registerOngoing(Ongoing ongoing);
}
