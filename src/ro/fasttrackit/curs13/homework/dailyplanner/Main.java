package ro.fasttrackit.curs13.homework.dailyplanner;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner();

        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Wake up");
        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Go to work");
        dailyPlanner.addActivity(DaysOfTheWeek.TUESDAY, "Meeting");
        dailyPlanner.addActivity(DaysOfTheWeek.WEDNESDAY, "Breakfast");
        dailyPlanner.removeActivity(DaysOfTheWeek.MONDAY, "Go to work");
        System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.MONDAY));

    }
}
