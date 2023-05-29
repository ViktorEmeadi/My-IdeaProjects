package classwork;
public class Clock {
    private int hour;
    private int mins;
    private int sec;

    public Clock(int hour, int mins, int sec){
        this.hour = hour;
        this. mins = mins;
        this.sec = sec;
    }

    public void setHour(int hour){
        this.hour = hour;
        if (hour > 23 && mins > 59 && sec > 59){
            hour = 0;
            mins = 0;
            sec = 0;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMins(int mins){
        this.mins = mins;
        if (hour > 23 && mins > 59 && sec > 59){
            hour = 0;
            mins = 0;
            sec = 0;
        }
    }
    public int getMins(){
        return mins;
    }
    public void setSec(int sec){
        this.sec = sec;
        if (hour > 23 && mins > 59 && sec > 59){
            hour = 0;
            mins = 0;
            sec = 0;
        }
    }
    public int getSec(){
        return sec;
    }

    public String displayTime() {
        String result = (getHour()+":"+getMins()+":"+getSec());
        return result;
    }
}
