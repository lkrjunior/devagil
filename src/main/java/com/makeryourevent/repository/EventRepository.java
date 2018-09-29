package com.makeryourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.util.CalendarUtils;

import java.util.*;
import java.util.stream.Collectors;

public class EventRepository {


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

        if (CalendarUtils.isExpiredTicket(event.getStartTicketDate(), event.getEndTicketDate())) {
            throw new IllegalArgumentException("Invalid period ticket");
        }

        if (!isValidTickets(event.getTickets())) {
            throw new IllegalArgumentException("Invalid tickets");
        }
    }

    public List<Event> getListOfEvents() {
        return new ArrayList<Event>();
    }

    private boolean isValidName(String name) {
        return name != null && name.length() <= 150;
    }

    private boolean isValidEventDate(String startDate, String endDate) {
        if (startDate != null || endDate != null) {
            Date start = CalendarUtils.stringToDate(startDate);
            Date end = CalendarUtils.stringToDate(endDate);
            return !CalendarUtils.isExpiredEvent(start, end);
        }
        return false;

    }

    private boolean isValidTickets(List<Ticket> tickets) {
        if (tickets == null || tickets.size() == 0) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticketFirst = tickets.get(i);
            for (int j = i + 1; j < tickets.size(); j++) {
                Ticket ticketNext = tickets.get(j);
                if (ticketFirst.getType().equals(ticketNext.getType())) {
                    count++;
                }
            }
        }

        return tickets.size() == tickets.stream().collect(Collectors.groupingBy(Ticket::getType)).size();
    }
}
