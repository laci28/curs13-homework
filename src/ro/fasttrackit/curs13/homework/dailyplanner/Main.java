package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> scheduleMon = Arrays.asList("Wake up", "Drink coffee", "Go to work", "Meeting", "Go home", "Sleep");
        List<String> scheduleTue = Arrays.asList("Wake up", "Go to work", "Go home", "Sleep");
        List<String> scheduleWed = Arrays.asList("Wake up", "Go to work", "Eat", "Go home", "Sleep");
        List<String> scheduleThu = Arrays.asList("Wake up", "Go to work", "Meeting", "Eat", "Go home", "Sleep");
        List<String> scheduleFri = Arrays.asList("Wake up", "Go to work", "Eat", "Walk", "Go home", "Sleep");

        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule(DaysOfTheWeek.MONDAY, scheduleMon),
                new DaySchedule(DaysOfTheWeek.TUESDAY, scheduleTue),
                new DaySchedule(DaysOfTheWeek.WEDNESDAY, scheduleWed),
                new DaySchedule(DaysOfTheWeek.THURSDAY, scheduleThu),
                new DaySchedule(DaysOfTheWeek.FRIDAY, scheduleFri)
        ));

        try {
            System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.TUESDAY, "Coffee"));
            System.out.println(dailyPlanner.daySchedules.get(1));
        } catch (NoActivityException ex){
            System.out.println(ex.getMessage());
        }
        /*switch () {
            case DaysOfTheWeek.MONDAY -> System.out.println(scheduleMon);
            case DaysOfTheWeek.TUESDAY -> System.out.println(scheduleTue);
            case DaysOfTheWeek.WEDNESDAY -> System.out.println(scheduleWed);
            case DaysOfTheWeek.THURSDAY -> System.out.println(scheduleThu);
            case DaysOfTheWeek.FRIDAY -> System.out.println(scheduleFri);
            default -> System.out.println("Weekend!");
       }*/
    }
}
