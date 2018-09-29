package com.makeryourevent.model;

import java.util.LinkedHashMap;

public class Event {

    private int id;
    private String eventName;
    private String startDateEvent;
    private String endDateEvent;
    private LinkedHashMap<TicketType, Ticket> tickets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDateEvent() {
        return startDateEvent;
    }

    public void setStartDateEvent(String startDateEvent) {
        this.startDateEvent = startDateEvent;
    }

    public String getEndDateEvent() {
        return endDateEvent;
    }

    public void setEndDateEvent(String endDateEvent) {
        this.endDateEvent = endDateEvent;
    }

    public LinkedHashMap<TicketType, Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(LinkedHashMap<TicketType, Ticket> tickets) {
        this.tickets = tickets;
    }
}
