package com.test.service;

import com.test.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketServiceIMPL implements TicketService{

    @Autowired
    private TicketRepository ticketRepository;

}
