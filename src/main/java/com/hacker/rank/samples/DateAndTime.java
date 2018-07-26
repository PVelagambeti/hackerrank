package com.hacker.rank.samples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Input Format
 *
 * A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
 *
 * Output Format:
 *
 * Output the correct day in capital letters.
 *
 * Sample Input:
 *
 * 08 05 2015
 *
 * Sample Output:
 *
 * WEDNESDAY
 *
 * Solution:
 *
 * If you are using the Calendar class, there are a few things you must check so it works.
 * First, import the Calendar class from the java.util package.
 * Then, when parsing the month parameter to an integer, remember to subtract 1 since months in Calendar go from 0 to 12.
 * When using the get method for Calendar.DAY_OF_WEEK, it returns a number from 1 to 7, from Sunday to Saturday, so make sure you subtract 1 if you use a string array.
 *
 */
public class DateAndTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String date = sc.next();
        String year = sc.next();

        System.out.println(getDay(date, month, year));
        System.out.println(getDay1(date, month, year));
    }

    public static DayOfWeek getDay(String date, String month, String year) {
        LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));
        return localDate.getDayOfWeek();
    }

    public static String getDay1(String date, String month, String year) {
        String day[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return day[dayOfWeek - 1];
    }

}
