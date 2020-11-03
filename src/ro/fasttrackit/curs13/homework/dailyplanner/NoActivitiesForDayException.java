package ro.fasttrackit.curs13.homework.dailyplanner;

public class NoActivitiesForDayException extends RuntimeException{
    public NoActivitiesForDayException(String message){
        super(message);
    }
}
