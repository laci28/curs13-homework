package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.*;

public class DailyPlanner {
    List<DaySchedule> daySchedules = new ArrayList<>();

    public DailyPlanner(Collection<DaySchedule> daySchedules) {
        if (daySchedules != null) {
            this.daySchedules.addAll(daySchedules);
        }
    }

    public Map<DaysOfTheWeek, List<String>> addActivity(DaysOfTheWeek days, String activity){
        List<String> activit = new ArrayList<>();
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();

        for (DaySchedule daySchedule : daySchedules){
            if (daySchedule.getDay().equals(days)){
                //daySchedule.getSchedule().add(activity);
                result.put(daySchedule.getDay(), daySchedule.setSchedule());
            }
        }
        return result;
    }
}
