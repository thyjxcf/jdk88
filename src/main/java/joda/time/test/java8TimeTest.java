package joda.time.test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/9/6 10:22
 */
public class java8TimeTest {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear() + "," + localDate.getMonthValue() + " ," + localDate.getDayOfMonth());

        System.out.println("---------------");
        LocalDate localDate1 = LocalDate.of(2011, 11, 2);
        System.out.println(localDate1);
        System.out.println("-------------");
        LocalDate localDate2 = LocalDate.of(2010, 3, 25);
        MonthDay monthDay = MonthDay.of(localDate2.getMonth(), localDate2.getDayOfMonth());

        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2013, 3, 25));
        if (monthDay.equals(monthDay1)) {
            System.out.println("=============");
        }else{
            System.out.println("not equals");
        }

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = localTime.minusHours(1).plusMinutes(3);
        System.out.println(localTime);
        //找到当前时间的下2周的时间
        LocalDate localDate3 = LocalDate.now();
        localDate3 = localDate3.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate3);
        localDate3 = localDate3.minus(3, ChronoUnit.MONTHS);
        System.out.println(localDate3);

        System.out.println("-------------");
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        System.out.println("-------------");
        LocalDate localDate4 = LocalDate.now();
        LocalDate localDate5 = LocalDate.of(2019, 10, 23);
        System.out.println(localDate4.isAfter(localDate5));
        System.out.println(localDate4.isBefore(localDate5));
        System.out.println(localDate4.isEqual(localDate5));

        System.out.println("--------------");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());
        System.out.println("----------");
        YearMonth yearMonth1 = YearMonth.of(2016, 2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth1.isLeapYear());
        System.out.println("----------");
        LocalDate localDate6 = LocalDate.now();
        LocalDate localDate7 = LocalDate.of(2019, 8, 11);
        Period period = Period.between(localDate7, localDate6);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println("-----------");

        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
