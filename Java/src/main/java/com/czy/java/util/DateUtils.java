package com.czy.java.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

    private static final String dtf = "yyyy-MM-dd HH:mm:ss";

    public static String toString(Date date) {
        return toString(date, dtf);
    }

    public static String toString(Date date, String dtf) {
        SimpleDateFormat sdf = new SimpleDateFormat(dtf);
        return sdf.format(date);
    }

    public static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
