package com.makeryourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.util.CalendarUtils;

import java.util.*;
import java.util.stream.Collectors;

public class EventRepository {

    private TicketRepository ticketRepository;

    public EventRepository() {
        ticketRepository = new TicketRepository();
    }

    public Event getEventById(int id) {
        return new Event();
    }

    public void saveEvent(Event event) throws IllegalArgumentException {
        if (!isValidName(event.getEventName())) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (!isValidEventDate(event.getStartDateEvent(), event.getEndDateEvent())) {
            throw new IllegalArgumentException("Invalid date");
        }

        ticketRepository.isValidTicket(event);
    }

    public List<Event> getListOfEvents() {
        return new ArrayList<Event>();
    }

    private boolean isValidName(String name) {
        return name != null && name.length() <= 150;
    }

    public boolean isValidEventDate(String startDate, String endDate) {
        if (startDate == null || endDate == null) {
            return false;
        }

        Date start = CalendarUtils.stringToDate(startDate);
        Date end = CalendarUtils.stringToDate(endDate);
        return !CalendarUtils.isExpiredEvent(start, end);
    }


}
