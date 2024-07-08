package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Ticket;
import com.neoteric.javatdd.model.TicketTemplate;
import com.neoteric.javatdd.service.TicketService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketForm {
    @Test
    public void test(){
        TicketTemplate t=new TicketTemplate();
        t.cost=150;
        t.loc="hyd";
        t.movieName="Kalki";
        t.seat="f5";
        TicketService ticketService=new TicketService();
        Ticket tic=ticketService.ticket(t);
        Assertions.assertEquals("f5",tic.seatNo);
        Assertions.assertEquals(150,tic.cost);
    }
}
