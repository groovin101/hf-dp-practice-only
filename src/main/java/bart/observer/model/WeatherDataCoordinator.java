package bart.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Master object to track temp, humidity, and pressure coming from the weather station. Pushes this data to
 * individual displays. This is the SUBJECT in the Subject/Observer relationship.
 *
 * Note that this could have used the built in (java6) Observable class.
 * @see java.util.Observable
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

    public WeatherDataDetails getWeatherDataDetails() {
        return weatherDataDetails;
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