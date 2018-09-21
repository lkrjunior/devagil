package com.makeryourevent.repository;

import com.makeryourevent.model.Event;

public class EventRepository {


    public Event getEventById(int id) {
        return new Event();
    }

    public void saveEvent(Event event) {
        if (!isValidName(event.getEventName())) {
            throw new IllegalArgumentException("Invalid name");
        }

        if(!isValidDate(event.getStartDateEvent(), event.getEndDateEvent())){
            throw new IllegalArgumentException("Invalid date");
        }
    }


    private boolean isValidName(String name) {
        return name != null && name.length() <= 150;
    }

    private boolean isValidDate(String startDate, String endDate) {
        return startDate != null && endDate != null;
    }
}
