package com.makeryourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.util.CalendarUtils;

import java.util.*;

public class EventRepository {


    public Event getEventById(int id) {
        return new Event();
    }

    public void saveEvent(Event event) {
        if (!isValidName(event.getEventName())) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (!isValidDate(event.getStartDateEvent(), event.getEndDateEvent())) {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public List<Event> getListOfEvents() {
        return new ArrayList<Event>();
    }

    private boolean isValidName(String name) {
        return name != null && name.length() <= 150;
    }

    private boolean isValidDate(String startDate, String endDate) {
        if (startDate != null || endDate != null) {
            Date start = CalendarUtils.stringToDate(startDate);
            Date end = CalendarUtils.stringToDate(endDate);
            return !CalendarUtils.isExpired(start, end);
        }
        return false;

    }
}
