package com.makeryourevent.model;

import java.util.List;

public class Event {

    private int id;
    private String eventName;
    private String startDateEvent;
    private String endDateEvent;
    private List<Ticket> tickets;
    private String startTicketDate;
    private String endTicketDate;

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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getStartTicketDate() {
        return startTicketDate;
    }

    public void setStartTicketDate(String startTicketDate) {
        this.startTicketDate = startTicketDate;
    }

    public String getEndTicketDate() {
        return endTicketDate;
    }

    public void setEndTicketDate(String endTicketDate) {
        this.endTicketDate = endTicketDate;
    }
}
