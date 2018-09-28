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

    public static boolean isExpired(Date startDate, Date endDate) {
        Date today = Calendar.getInstance().getTime();
        return startDate.before(today) && today.after(endDate);
    }

    public static String dateToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return format.format(date);
    }
}
