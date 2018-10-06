package com.makeryourevent.repository;

import com.makeryourevent.model.Discount;
import com.makeryourevent.model.DiscountType;
import com.makeryourevent.model.Event;
import com.makeryourevent.model.Ticket;

import java.util.Arrays;

public class DiscountRepository {

    public boolean isDiscountValid(Discount discount) {
        if (discount.getType() == null) {
            return false;
        }

        return Arrays.stream(DiscountType.values()).anyMatch(discountType ->
                discountType.name().equals(discount.getType().name()));
    }

    public Double calculateDiscount(Ticket ticket, Discount discount) {
        Double ticketPrice = ticket.getPrice();
        Double discountValue = discount.getDiscount();
        return ticketPrice * discountValue;
    }
}
