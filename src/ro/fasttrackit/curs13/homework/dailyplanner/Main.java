package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule(DaysOfTheWeek.MONDAY, "Wake up"),
                new DaySchedule(DaysOfTheWeek.TUESDAY, "Wake up"),
                new DaySchedule(DaysOfTheWeek.WEDNESDAY, "Wake up"),
                new DaySchedule(DaysOfTheWeek.THURSDAY, "Wake up"),
                new DaySchedule(DaysOfTheWeek.FRIDAY, "Wake up"),
                new DaySchedule(DaysOfTheWeek.MONDAY, "Go to work")
        ));

    }
}
