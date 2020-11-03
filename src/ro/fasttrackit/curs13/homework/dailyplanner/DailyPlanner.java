package ro.fasttrackit.curs13.homework.dailyplanner;

import java.util.*;

public class DailyPlanner {
    List<String> day1 = new ArrayList<>();
    List<String> day2 = new ArrayList<>();
    List<String> day3 = new ArrayList<>();
    List<String> day4 = new ArrayList<>();
    List<String> day5 = new ArrayList<>();
    List<String> day6 = new ArrayList<>();
    List<String> day7 = new ArrayList<>();

    public Map<DaysOfTheWeek, List<String>> addActivity(DaysOfTheWeek days, String activity) {
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();
        try {
            if (days.equals(DaysOfTheWeek.MONDAY)) {
                day1.add(activity);
                result.put(days, day1);
            } else if (days.equals(DaysOfTheWeek.TUESDAY)) {
                day2.add(activity);
                result.put(days, day2);
            } else if (days.equals(DaysOfTheWeek.WEDNESDAY)) {
                day3.add(activity);
                result.put(days, day3);
            } else if (days.equals(DaysOfTheWeek.THURSDAY)) {
                day4.add(activity);
                result.put(days, day4);
            } else if (days.equals(DaysOfTheWeek.FRIDAY)) {
                day5.add(activity);
                result.put(days, day5);
            } else if (days.equals(DaysOfTheWeek.SATURDAY)) {
                day6.add(activity);
                result.put(days, day6);
            } else if (days.equals(DaysOfTheWeek.SUNDAY)) {
                day7.add(activity);
                result.put(days, day7);
            }
        } catch (NoActivityException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public Map<DaysOfTheWeek, List<String>> removeActivity(DaysOfTheWeek days, String activity) {
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();
        try {
            if (days.equals(DaysOfTheWeek.MONDAY)) {
                day1.remove(activity);
                result.remove(days, day1);
            } else if (days.equals(DaysOfTheWeek.TUESDAY)) {
                day2.remove(activity);
                result.remove(days, day2);
            } else if (days.equals(DaysOfTheWeek.WEDNESDAY)) {
                day3.remove(activity);
                result.remove(days, day3);
            } else if (days.equals(DaysOfTheWeek.THURSDAY)) {
                day4.remove(activity);
                result.remove(days, day4);
            } else if (days.equals(DaysOfTheWeek.FRIDAY)) {
                day5.remove(activity);
                result.remove(days, day5);
            } else if (days.equals(DaysOfTheWeek.SATURDAY)) {
                day6.remove(activity);
                result.remove(days, day6);
            } else if (days.equals(DaysOfTheWeek.SUNDAY)) {
                result.remove(days, day7.remove(activity));
            }
        } catch (NoActivityException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public List<String> getActivities(DaysOfTheWeek day) {
        if (day.equals(DaysOfTheWeek.MONDAY)) {
            return day1;
        } else if (day.equals(DaysOfTheWeek.TUESDAY)) {
            return day2;
        } else if (day.equals(DaysOfTheWeek.WEDNESDAY)) {
            return day3;
        } else if (day.equals(DaysOfTheWeek.THURSDAY)) {
            return day4;
        } else if (day.equals(DaysOfTheWeek.FRIDAY)) {
            return day5;
        } else if (day.equals(DaysOfTheWeek.SATURDAY)) {
            return day6;
        } else {
            return day7;
        }
    }

    public Map<DaysOfTheWeek, List<String>> endPlanning(){
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();
        try{

        }catch (NoActivitiesForDayException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
