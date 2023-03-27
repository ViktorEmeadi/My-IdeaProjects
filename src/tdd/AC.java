package tdd;

public class AC {
    private boolean isOn;
    private int temperature = 26;

    public void toggleOn() {
        isOn = !isOn;
    }
    public boolean isOn() {
         return this.isOn = isOn;
    }


    public void increaseTemperature() {
        if (temperature > 15 && temperature < 30) temperature++;
        if (temperature < 1) temperature  = 0;
        else temperature = temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 15 && temperature < 30) temperature--;
        if (temperature < 1) temperature = 0;
        else temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}

