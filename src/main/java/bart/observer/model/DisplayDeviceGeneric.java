package bart.observer.model;

import java.util.Observable;

/**
 *
 */
public abstract class DisplayDeviceGeneric implements DisplayDevice {

    protected WeatherDataDetails weatherDataDetails;
    protected String nameOfDevice;

    public DisplayDeviceGeneric(String nameOfDevice) {
        this.nameOfDevice = nameOfDevice;
    }

    public String getName() {
        return nameOfDevice;
    }

    /**
     * ABSTRACT: Implement as appropriate for each display type
     */
    public abstract void display();

    public WeatherDataDetails getWeatherDataDetails() {
        return weatherDataDetails;
    }

    public void update(Observable o, Object arg) {
        if (!(o instanceof WeatherDataCoordinator)) {
            throw new IllegalArgumentException("Observable object must be an instance of WeatherDataCoordinator");
        }
        if (!(arg instanceof WeatherDataDetails)) {
            throw new IllegalArgumentException("Date arg must be an instance of WeatherDataDetails");
        }
        this.weatherDataDetails = (WeatherDataDetails)arg;
    }
}
