package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner();
        Scanner keyboard = new Scanner(System.in);
        String activit;
        String readDay;
        System.out.println("Please choose an option: ");
        System.out.println("1. add an activity");
        System.out.println("2. remove an activity");
        System.out.println("3. list all activities");
        System.out.println("4. end planning");
        System.out.print("Your choice: ");
        int input = keyboard.nextInt();
        switch (input) {
            case 1:
                try {
                    System.out.print("Please select a day: ");
                    readDay = keyboard.nextLine();
                    DaysOfTheWeek day = DaysOfTheWeek.valueOf(readDay.toUpperCase());
                    System.out.print("Pleas add an activity: ");
                    activit = keyboard.nextLine();
                    dailyPlanner.addActivity(day, activit);
                    break;
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            case 2:
                activit = keyboard.nextLine();
                dailyPlanner.removeActivity(DaysOfTheWeek.MONDAY, activit);
                break;
            case 3:
                System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.MONDAY));
                break;
            case 4:
                System.out.println(dailyPlanner.endPlanning());
                break;
            default:
                System.out.println("No have this option");
        }

/*
        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Wake up");
        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Go to work");
        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "Meeting");
        dailyPlanner.addActivity(DaysOfTheWeek.TUESDAY, "Meeting");
        dailyPlanner.addActivity(DaysOfTheWeek.WEDNESDAY, "Breakfast");
        dailyPlanner.removeActivity(DaysOfTheWeek.MONDAY, "Go to work");
        System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.MONDAY));
        System.out.println(dailyPlanner.endPlanning());*/
    }
}
