package joda.time.test;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/9/6 9:53
 */
public class JodaTime3 {
    //标准UTC时间 2014-11-04T09:22:22.232Z
    public static void main(String[] args) {
        Date date = converUTC2Date("2014-11-04T09:22:22.232Z");
        System.out.println(date);
        System.out.println(convertDate2Utc(new Date()));
    }

    public static Date converUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception e) {
           return null;
        }
    }

    public static String convertDate2Utc(Date date) {
        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        return dateTime.toString();
    }
}
