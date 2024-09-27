package com.czy.java.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeUtils {
    private static final String dtf = "yyyy-MM-dd HH:mm:ss";

    public static String toString(LocalDateTime localDateTime) {
        return toString(localDateTime, dtf);
    }

    public static String toString(LocalDateTime localDateTime, String dtf) {
        return localDateTime.format(DateTimeFormatter.ofPattern(dtf));
    }

    public static LocalDate toLocalDate(LocalDateTime localDateTime) {
        return localDateTime.toLocalDate();
    }

    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
