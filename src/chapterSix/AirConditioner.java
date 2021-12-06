package chapterSix;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void increaseTemperature() {
        if (temperature < 30)
        temperature = temperature + 1;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
        temperature = temperature - 1;
    }


}
