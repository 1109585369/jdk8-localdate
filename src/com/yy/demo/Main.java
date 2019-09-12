package com.yy.demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {


        //获取当前年月日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //构造指定的年月日
        LocalDate localDate1 = LocalDate.of(2019,9,10);

        //获取年月日星期几
        int year = localDate.getYear();

        int year1 = localDate.get(ChronoField.YEAR);

        Month month = localDate.getMonth();

        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);

        int day = localDate.getDayOfMonth();

        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        int dayOfweek1 = localDate.get(ChronoField.DAY_OF_WEEK);



        //获取时分秒0
        LocalTime localTime = LocalTime.of(13,51,10);
        LocalTime localTime1 = LocalTime.now();


        //获取小时
        int hour = localTime.getHour();
        int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);


        //获取分
        int minute = localTime.getMinute();
        int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);

        //获取秒
        int second = localTime.getMinute();
        int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);


        //获取年月日时分秒
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(formatter));


        LocalDateTime localDateTime1 = LocalDateTime.of(2019,Month.SEPTEMBER,10,14,46,56);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate,localTime);
        LocalDateTime localDateTime3 = localDate.atTime(localTime);
        LocalDateTime localDateTime4 = localTime.atDate(localDate);

        LocalDate localDate2 = localDateTime.toLocalDate();
        LocalTime localTime2 = localDateTime.toLocalTime();
        System.out.println(localDate2);
        System.out.println(localTime2);

        Instant instant = Instant.now();

        long currentSecond = instant.getEpochSecond();

        long currentMilli = instant.toEpochMilli();


        LocalDateTime localDateTime5 = LocalDateTime.of(2019,Month.SEPTEMBER,10,14,46,56);

        //增加一年
        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plus(1, ChronoUnit.YEARS);

        //减少一个月
        localDateTime = localDateTime.minusMonths(1);
        localDateTime = localDateTime.minus(1,ChronoUnit.MONTHS);


        ///修改年为2019
        localDateTime = localDateTime.withYear(2020);

        //修改为2022
        localDateTime = localDateTime.with(ChronoField.YEAR,2022);


        //时间计算
        LocalDate localDate3 = LocalDate.now();



    }
}
