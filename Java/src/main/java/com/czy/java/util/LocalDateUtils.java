package com.czy.java.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateUtils {

    private static final String dtf = "yyyy-MM-dd HH:mm:ss";

    public static String toString(LocalDate localDate) {
        return toString(localDate, dtf);
    }

    public static String toString(LocalDate localDate, String dtf) {
        return localDate.format(DateTimeFormatter.ofPattern(dtf));
    }

    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime toLocalDateTime(LocalDate localDate) {
        return localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
