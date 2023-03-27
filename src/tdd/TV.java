package tdd;

import java.sql.Struct;

public class TV {
    private boolean isOn;
    private int changeButton = 1;
    private int increaseVol;
    private int decreaseVol;


    public boolean isOn() {
        return this.isOn = isOn;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public void changeChannel(int changeButton) {
        this.changeButton = changeButton;
    }

    public String getChannel() {
        if (changeButton > 0 && changeButton < 7) {
            if (changeButton == 1) return "Nickelodeon";
            else if (changeButton == 2) return "CNN";
            else if (changeButton == 3) return "MTV";
            else if (changeButton == 4) return "Sound-City";
            else if (changeButton == 5) return "WWE";
            else return "Hip-TV";
        } else return "Nickelodeon";
    }

    public int increaseVolume() {
        if (increaseVol >= 0 && increaseVol < 100) return increaseVol++;
        else if (increaseVol == 100) return increaseVol = 100;
        else return increaseVol = 0;
    }


    public int decreaseVolume() {
        if (increaseVol > 1 && increaseVol < 101) return increaseVol--;
        else return increaseVol = 0;
    }

    public int getVolume() {
        return increaseVol - decreaseVol;
    }
}