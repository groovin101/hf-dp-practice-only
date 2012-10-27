package bart.observer.model;

/**
 * Hold the details needed to implement a display, ie the data itself
 */
public class WeatherDataDetails {

    private double tempCurrent;
    private double humidity;
    private double pressureBarometric;

    public WeatherDataDetails(double tempCurrent, double humidity, double pressureBarometric) {
        this.tempCurrent = tempCurrent;
        this.humidity = humidity;
        this.pressureBarometric = pressureBarometric;
    }

    public double getTempCurrent() {
        return tempCurrent;
    }
    public double getHumidity() {
        return humidity;
    }
    public double getPressureBarometric() {
        return pressureBarometric;
    }
}
