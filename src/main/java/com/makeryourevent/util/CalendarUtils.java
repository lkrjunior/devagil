package com.makeryourevent.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {

    public static Date stringToDate(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            return format.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static boolean isExpiredEvent(Date startDate, Date endDate) {
        Date today = Calendar.getInstance().getTime();
        return startDate.before(today) && today.after(endDate);
    }

    public static boolean isExpiredTicket(Date startDate, Date endDate) {
        return startDate.after(endDate);
    }

    public static boolean isExpiredTicket(String startDate, String endDate) {
        Date start = stringToDate(startDate);
        Date end = stringToDate(endDate);
        return isExpiredTicket(start, end);
    }

    public static String dateToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return format.format(date);
    }
}
