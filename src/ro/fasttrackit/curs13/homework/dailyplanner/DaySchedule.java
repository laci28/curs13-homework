package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.List;

public class DaySchedule {
    private List<String> schedule;
    private final DaysOfTheWeek day;

    public DaySchedule(DaysOfTheWeek day, List<String> schedule) {
        this.schedule = schedule;
        this.day = day;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Day schedule: " + schedule;
    }

}
