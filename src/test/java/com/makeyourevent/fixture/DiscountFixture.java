package com.makeyourevent.fixture;

import com.makeryourevent.model.Discount;
import com.makeryourevent.model.DiscountType;

public class DiscountFixture {

    public static DiscountType createDiscountFixtureType() {
        return DiscountType.GOLD;
    }

    public static Discount createDiscount() {
        Discount discount = new Discount();
        discount.setType(createDiscountFixtureType());
        return discount;
    }
}
