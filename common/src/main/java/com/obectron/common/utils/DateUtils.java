package com.obectron.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.util.Date;

import static com.obectron.common.utils.Constants.DATE_FORMAT_INSTANCE;

@Slf4j
public class DateUtils {

    private DateUtils() {}

    public static java.sql.Date toSqlDate(Date date) {
        return java.sql.Date.valueOf(date.toString());
    }

    public static Date toDate(java.sql.Date date) {
        Date  parsedDate = null;
        try {
            parsedDate = DATE_FORMAT_INSTANCE.parse(date.toString());
        } catch (ParseException e) {
            log.error("Error parsing date {}", date.toString(), e);
        }
        return parsedDate;
    }
}
