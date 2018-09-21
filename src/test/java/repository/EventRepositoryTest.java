package java.repository;

import com.makeryourevent.model.Event;
import com.makeryourevent.repository.EventRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EventRepositoryTest {

    private EventRepository repository;

    @Before
    private void setup() {
        repository = new EventRepository();
    }


    @Test
    private void getUserById() {
        Assert.assertNotNull(repository.getEventById(1));
    }

    @Test
    private void saveEvent() {
        Event event = new Event();
        event.setEventName("Evento de teste");
        event.setStartDateEvent("2018-09-21 18:30:22");
        repository.saveEvent(event);
    }
}
