package com.makeyourevent.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.repository.EventRepository;
import com.makeryourevent.util.CalendarUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

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
        Event event = new Event();
        event.setEventName("Evento de teste");
        event.setStartDateEvent(CalendarUtils.dateToString(start));
        event.setEndDateEvent(CalendarUtils.dateToString(end));
        repository.saveEvent(event);
    }

    @Test
    public void getListOfEvents() {
        Assert.assertNotNull(repository.getListOfEvents());
    }
}
