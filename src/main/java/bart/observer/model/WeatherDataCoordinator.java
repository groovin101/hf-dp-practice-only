package bart.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Master object to track temp, humidity, and pressure coming from the weather station. Pushes this data to
 * individual displays.
 */
public class WeatherDataCoordinator {

    private WeatherDataDetails weatherDataDetails;
    private List<DisplayDevice> observers;

    /**
     * CONSTRUCTOR
     * @param weatherDataDetails
     */
    public WeatherDataCoordinator(WeatherDataDetails weatherDataDetails) {
        this.weatherDataDetails = weatherDataDetails;
        observers = new ArrayList<DisplayDevice>();
    }

    public void registerObserver(DisplayDevice listener) {
        observers.add(listener);
        listener.updateWeatherDetails(weatherDataDetails);
    }

    public List<DisplayDevice> getObservers() {
        return observers;
    }

    public DisplayDevice getNamedObserver(String name) {
        if (observers != null) {
            for (DisplayDevice device : observers) {
                if (device instanceof DisplayDeviceNamed && ((DisplayDeviceNamed)device).getNameOfThisDevice().equals(name)) {
                    return device;
                }
            }
        }
        return null;
    }

    public double getTempCurrent() {
        return weatherDataDetails.getTempCurrent();
    }
    public double getHumidity() {
        return weatherDataDetails.getHumidity();
    }
    public double getPressureBarometric() {
        return weatherDataDetails.getPressureBarometric();
    }

    public void updateData(WeatherDataDetails details) {
        this.weatherDataDetails = details;
        if (observers != null) {
            for (DisplayDevice device : observers) {
                device.updateWeatherDetails(details);
            }
        }
        System.out.println("calling measurments changed..............................");
        measurementsChanged();
    }

    public void measurementsChanged() {
        System.out.println("NOW IN mesasurment changed");
    }
}