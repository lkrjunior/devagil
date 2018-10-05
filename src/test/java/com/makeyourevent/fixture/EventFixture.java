package com.makeyourevent.fixture;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;
import com.makeryourevent.util.CalendarUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventFixture {

    public static Event createEvent() {
        Date start = CalendarUtils.stringToDate("2050-12-21T23:59:00");
        Date end = CalendarUtils.stringToDate("2051-01-01T23:59:00");

        Event event = new Event();
        event.setEventName("Evento de teste");
        event.setStartDateEvent(CalendarUtils.dateToString(start));
        event.setEndDateEvent(CalendarUtils.dateToString(end));

        event.setStartTicketDate("2050-02-21T23:59:00");
        event.setEndTicketDate("2051-03-01T23:59:00");
        event.setTickets(TicketFixture.createTickets());
        return event;
    }
}
