package ro.fasttrackit.curs13.homework.dailyplanner;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner();

        try {
            System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Wake up"));
            System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Go to work"));
            System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.TUESDAY, "Meeting"));
            System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.WEDNESDAY, "Breakfast"));
            System.out.println(dailyPlanner.removeActivity(DaysOfTheWeek.MONDAY, "Go to work"));
        } catch (NoActivityException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
