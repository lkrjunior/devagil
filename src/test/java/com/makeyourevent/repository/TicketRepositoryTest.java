package com.makeyourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;
import com.makeryourevent.repository.TicketRepository;
import com.makeyourevent.fixture.EventFixture;
import com.makeyourevent.fixture.TicketFixture;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TicketRepositoryTest {

    private TicketRepository repository;

    @Before
    public void setup() {
        repository = new TicketRepository();
    }

    @Test
    public void shouldValidateDuplicateTickets() {
        List<Ticket> tickets = TicketFixture.createTickets();
        Assert.assertTrue(repository.isValidTickets(tickets));
    }

    @Test
    public void shouldReturnThePriceOfTicket() {
        Double expected = 1000.00;
        TicketType ticket = TicketFixture.createType(TicketType.VIP);
        Assert.assertEquals(expected, ticket.getPrice());
    }

    @Test
    public void shouldCheckValidateOfTicketSales() {
        Event event = EventFixture.createEvent();
        Assert.assertFalse(repository.isExpiredTicket(event.getStartTicketDate(), event.getEndTicketDate()));
    }

    @Test
    public void shouldValidateTicketInformations() {
        Event event = EventFixture.createEvent();
        Assert.assertTrue(repository.isValidTicket(event));
    }

}
