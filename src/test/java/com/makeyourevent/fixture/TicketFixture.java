package com.makeyourevent.fixture;

import com.makeryourevent.model.TicketType;

public class TicketFixture {

    public static TicketType createType(TicketType type) {
        return TicketType.valueOf(type.name());
    }
}
