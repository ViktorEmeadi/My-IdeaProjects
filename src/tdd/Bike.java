package tdd;

public class Bike {
    boolean isOn;
    int speed;

    public boolean isOn() {
        return isOn;
    }

    public void toggleOn(){
        isOn = !isOn;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int accelerate() {
        if (speed >= 0 && speed < 21) return speed += 1;
        else if (speed > 20 && speed < 31) return speed += 2;
        else if (speed > 30 && speed < 41)return speed += 3;
        else if (speed > 40) return speed += 4;
        else return 0;
    }

    public int deccelerate() {
        if (speed >= 0 && speed < 21) return speed -= 1;
        else if (speed > 20 && speed < 31) return speed -= 2;
        else if (speed > 30 && speed < 41)return speed -= 3;
        else if (speed > 40) return speed -= 4;
        else return 0;
    }

}
