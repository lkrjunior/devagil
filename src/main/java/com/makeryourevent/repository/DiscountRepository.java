package com.makeryourevent.repository;

import com.makeryourevent.model.*;

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

        if (discount.getType().equals(DiscountType.NORMAL)) {
            return discount.getDiscount();
        }

        return ticketPrice * discountValue;
    }

    public Double applyDiscount(Double ticketValue, Double discount) {
        return ticketValue - discount;
    }
}
