package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Ticket;
import com.neoteric.javatdd.model.TicketTemplate;

public class TicketService {
    public Ticket ticket(TicketTemplate template){
        Ticket ticket=new Ticket();
        ticket.seatNo=template.seat;
        ticket.time=template.time;
        ticket.cost=template.cost;
        return ticket;
    }
}
