package com.makeryourevent.model;

public class Ticket {

   private TicketType type;
   private int quantity;

    public TicketType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return type.getPrice();
    }
}
