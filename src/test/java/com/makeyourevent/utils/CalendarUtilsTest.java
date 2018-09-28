package com.makeyourevent.utils;

import com.makeryourevent.util.CalendarUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CalendarUtilsTest {

    @Test
    public void formatStringDate() {
        Assert.assertNotNull(CalendarUtils.stringToDate("2018-09-21T22:36:00"));
    }

    @Test
    public void isValidDateEvent() {
        Date startDate = CalendarUtils.stringToDate("2018-09-20T22:36:00");
        Date endDate = CalendarUtils.stringToDate("2018-09-20T22:36:00");
        Assert.assertTrue(CalendarUtils.isExpired(startDate, endDate));
    }
}
