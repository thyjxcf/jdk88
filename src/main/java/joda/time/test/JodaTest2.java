package joda.time.test;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/9/6 9:33
 */
public class JodaTest2 {

    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));

        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));
        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("------------------");
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);
        localDate = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate);
        System.out.println("--------------");
        //计算2年前 第三个月最后一天日期
        LocalDate localDate1 = new LocalDate();
        localDate = localDate1.plusYears(-2).withMonthOfYear(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate);
    }
}
