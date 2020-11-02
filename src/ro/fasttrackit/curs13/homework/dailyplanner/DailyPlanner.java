package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.*;

public class DailyPlanner {
    List<DaySchedule> daySchedules = new ArrayList<>();

    public Map<DaysOfTheWeek, String> addActivity(DaysOfTheWeek days, String activity) {
        Map<DaysOfTheWeek, String> result = new HashMap<>();
        result.put(days, activity);
        return result;
    }

    public Map<DaysOfTheWeek, String> removeActivity(DaysOfTheWeek days, String activity) {
        Map<DaysOfTheWeek, String> result = new HashMap<>();
        result.remove(days, activity);
        return result;
    }

}
