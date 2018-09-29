package com.makeryourevent.model;

public class Event {

    private int id;
    private String eventName;
    private String startDateEvent;
    private String endDateEvent;
    private TicketType[] tickets;

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

    public TicketType[] getTickets() {
        return tickets;
    }

    public void setTickets(TicketType[] tickets) {
        this.tickets = tickets;
    }
}
