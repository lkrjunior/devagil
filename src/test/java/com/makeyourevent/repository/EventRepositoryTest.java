package com.makeyourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;
import com.makeryourevent.repository.EventRepository;
import com.makeryourevent.util.CalendarUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.LinkedHashMap;

public class EventRepositoryTest {

    private EventRepository repository;

    @Before
    public void setup() {
        repository = new EventRepository();
    }


    @Test
    public void getUserById() {
        Assert.assertNotNull(repository.getEventById(1));
    }

    @Test
    public void saveEvent() {
        Date start = CalendarUtils.stringToDate("2050-12-21T23:59:00");
        Date end = CalendarUtils.stringToDate("2051-01-01T23:59:00");
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.VIP);
        ticket.setQuantity(50);
        LinkedHashMap<TicketType, Ticket> tickets = new LinkedHashMap<>();
        tickets.put(TicketType.VIP, ticket);

        Event event = new Event();
        IllegalArgumentException exception = null;
        event.setEventName("Evento de teste");
        event.setStartDateEvent(CalendarUtils.dateToString(start));
        event.setEndDateEvent(CalendarUtils.dateToString(end));
        event.setTickets(tickets);
        try {
            repository.saveEvent(event);
        }catch (IllegalArgumentException e) {
            exception = e;
        }

       Assert.assertNull(exception);
    }

    @Test
    public void getListOfEvents() {
        Assert.assertNotNull(repository.getListOfEvents());
    }

    @Test
    public void getPriceOfTicket() {
        Double expected = 1000.00;
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.VIP);
        ticket.setQuantity(1);
        Assert.assertEquals(expected, ticket.getPrice());
    }
}
