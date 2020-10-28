package ro.fasttrackit.curs13.homework.dailyplanner;

public class DaySchedule {
    private String schedule;
    private final DaysOfTheWeek day;

    public DaySchedule(DaysOfTheWeek day, String schedule) {
        this.schedule = schedule;
        this.day = day;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Day schedule: " + schedule;
    }
}
