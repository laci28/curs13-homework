package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.*;

public class DailyPlanner {
    List<DaySchedule> daySchedules = new ArrayList<>();

    public DailyPlanner(Collection<DaySchedule> daySchedules) {
        if (daySchedules != null) {
            this.daySchedules.addAll(daySchedules);
        }
    }

    public Map<DaysOfTheWeek, String> addActivity(DaysOfTheWeek days, String activity){
        Map<DaysOfTheWeek, String> result = new HashMap<>();
        for (DaySchedule daySchedule : daySchedules){
            
        }
        return result;
    }
}
