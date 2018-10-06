package com.makeyourevent.fixture;

import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;

import java.util.ArrayList;
import java.util.List;

public class TicketFixture {

    public static TicketType createType(TicketType type) {
        return TicketType.valueOf(type.name());
    }

    public static Ticket createTicket(TicketType type) {
        Ticket ticket = new Ticket();
        ticket.setType(type);
        ticket.setQuantity(1);
        return ticket;
    }

    public static List<Ticket> createTickets() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(createTicket(TicketType.VIP));
        tickets.add(createTicket(TicketType.BACKSTAGE));

        return tickets;
    }
}
