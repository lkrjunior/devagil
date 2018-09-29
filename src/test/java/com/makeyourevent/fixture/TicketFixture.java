package com.makeyourevent.fixture;

import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;

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
}
