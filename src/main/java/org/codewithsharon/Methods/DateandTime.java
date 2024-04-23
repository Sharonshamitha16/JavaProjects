package org.codewithsharon.Methods;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateandTime {
    public static void main(String[] args) {
        int month = 4; // April
        int day = 22;
        int year = 2024;

        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        // Create a LocalDate object representing the given date
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week from the LocalDate object
        DayOfWeek days= date.getDayOfWeek();

        // Return the name of the day of the week
        return days.toString();
    }
}
