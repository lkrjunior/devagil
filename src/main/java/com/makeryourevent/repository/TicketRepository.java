package com.makeryourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.util.CalendarUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TicketRepository {


    public boolean isValidTicket(Event event) throws IllegalArgumentException {
        if (isExpiredTicket(event.getStartTicketDate(), event.getEndTicketDate())) {
            throw new IllegalArgumentException("Invalid period ticket");
        }

        if (!isValidTickets(event.getTickets())) {
            throw new IllegalArgumentException("Invalid tickets");
        }

        return true;
    }


    public boolean isExpiredTicket(String startDate, String endDate) {
        return CalendarUtils.isExpiredTicket(startDate, endDate);
    }


    public boolean isValidTickets(List<Ticket> tickets) {
        if (tickets == null || tickets.size() == 0) {
            return false;
        }

        return tickets.size() == tickets.stream().collect(Collectors.groupingBy(Ticket::getType)).size();
    }
}
