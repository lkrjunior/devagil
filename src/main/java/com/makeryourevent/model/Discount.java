package com.makeryourevent.model;

public class Discount {

    private DiscountType type;

    public DiscountType getType() {
        return type;
    }

    public void setType(DiscountType type) {
        this.type = type;
    }

    public Double getDiscount() {
        return this.type.getDiscount();
    }
}
