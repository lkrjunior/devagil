package com.makeryourevent.model;

public enum DiscountType {

    GOLD(0.75),
    SILVER(0.65),
    STUDENT(0.50),
    OLD(0.50),
    NONE(0.00);

    private Double discount;

    DiscountType(Double discount) {
        this.discount = discount;
    }

    public Double getDiscount() {
        return discount;
    }
}
