package bart.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Master object to track temp, humidity, and pressure coming from the weather station. Pushes this data to
 * individual displays.
 */
public class WeatherData {

    private double tempCurrent;
    private double humidity;
    private double pressureBarometric;

    private List<DisplayDevice> observers;

    public WeatherData() {
        observers = new ArrayList<DisplayDevice>();
    }

    public void registerObserver(DisplayDevice listener) {
        observers.add(listener);
    }
    public List<DisplayDevice> getObservers() {
        return observers;
    }

    public double getTempCurrent() {
        return tempCurrent;
    }
    public void setTempCurrent(double tempCurrent) {
        this.tempCurrent = tempCurrent;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public double getPressureBarometric() {
        return pressureBarometric;
    }
    public void setPressureBarometric(double pressureBarometric) {
        this.pressureBarometric = pressureBarometric;
    }

}