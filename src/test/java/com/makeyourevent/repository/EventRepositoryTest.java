package com.makeyourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;
import com.makeryourevent.repository.EventRepository;
import com.makeyourevent.fixture.EventFixture;
import com.makeyourevent.fixture.TicketFixture;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class EventRepositoryTest {

    private EventRepository repository;

    @Before
    public void setup() {
        repository = new EventRepository();
    }

    @Test
    public void shouldReturnAUserById() {
        Assert.assertNotNull(repository.getEventById(1));
    }

    @Test
    public void shouldSaveEvent() {
        IllegalArgumentException exception = null;
        Event event = EventFixture.createEvent();

        try {
            repository.saveEvent(event);
        } catch (IllegalArgumentException e) {
            exception = e;
        }

        Assert.assertNull(exception);
    }

    @Test
    public void shouldReturnAValidListOfEvents() {
        Assert.assertNotNull(repository.getListOfEvents());
    }

    @Test
    public void shouldReturnThePriceOfTicket() {
        Double expected = 1000.00;
        TicketType ticket = TicketFixture.createType(TicketType.VIP);
        Assert.assertEquals(expected, ticket.getPrice());
    }

    @Test
    public void shouldValidateDuplicateTickets() {
        List<Ticket> tickets = TicketFixture.createTickets();
        Assert.assertTrue(repository.isValidTickets(tickets));
    }

    @Test
    public void shouldValidateATicketSaleTime() {
        Event event = EventFixture.createEvent();
        Assert.assertTrue(repository.isValidEventDate(event.getStartTicketDate(), event.getEndTicketDate()));
    }
}
