package TimeClass;

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public Time1(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        validateTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        validateTime(hour, minute, second);
    }
    public void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(second);
    }
    public void validateHour(int hour){
        boolean hourIsOutOfRange = hour < 0 || hour > 23;
        if (hourIsOutOfRange){
            throw new IllegalArgumentException("Hour was out of range");
        }
    }
    public void validateMinute(int minute){
        boolean minIsOutOfRange = minute < 0 || minute > 59;
        if (minIsOutOfRange) {
            throw new IllegalArgumentException("Minute was out of range");
        }
    }
    public void validateSeconds(int second){
        boolean secIsOutOfRange = second < 0 || second > 59;
        if(secIsOutOfRange) {
            throw new IllegalArgumentException("Second is out of range");
        }
    }
    public String getTime(){
        return hour +" "+minute+" "+second;
    }
}
