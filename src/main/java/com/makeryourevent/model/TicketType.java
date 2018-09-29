package com.makeryourevent.model;

public enum TicketType {

    VIP(1000.00),
    BACKSTAGE(800.00),
    PUBLIC_VIP(500.00),
    PUBLIC(300.00);

    private Double price;

    TicketType(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
