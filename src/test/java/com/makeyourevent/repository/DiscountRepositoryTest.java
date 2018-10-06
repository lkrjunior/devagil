package com.makeyourevent.repository;

import com.makeryourevent.model.Discount;
import com.makeryourevent.model.Ticket;
import com.makeryourevent.model.TicketType;
import com.makeryourevent.repository.DiscountRepository;
import com.makeyourevent.fixture.DiscountFixture;
import com.makeyourevent.fixture.TicketFixture;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscountRepositoryTest {

    private DiscountRepository repository;

    @Before
    public void setup() {
        repository = new DiscountRepository();
    }

    @Test
    public void testTypeOfDiscount() {
        Discount discount = DiscountFixture.createDiscount();
        Assert.assertTrue(repository.isDiscountValid(discount));
    }

    @Test
    public void shouldCalculateDiscountForATicket() {
        Double expectedDiscount = 1000 * 0.75 ;

        Ticket ticket = TicketFixture.createTicket(TicketType.VIP);
        Discount discount = DiscountFixture.createDiscount();
        Assert.assertEquals(expectedDiscount, repository.calculateDiscount(ticket, discount));
    }

    @Test
    public void shouldApplyDiscountForATicket() {
        Discount discount = DiscountFixture.createDiscount();
        Ticket ticket = TicketFixture.createTicket(TicketType.VIP);

        Double expectedValue = TicketType.VIP.getPrice() - (TicketType.VIP.getPrice() * discount.getDiscount());
        Double discountValue = repository.calculateDiscount(ticket, discount);

        Assert.assertEquals(expectedValue, repository.applyDiscount(ticket.getPrice(), discountValue));
    }

}
