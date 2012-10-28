package bart.observer.model;

/**
 *
 */
public abstract class DisplayDeviceGeneric implements DisplayDevice {

    protected WeatherDataDetails weatherDataDetails;
    protected String nameOfDevice;

    public DisplayDeviceGeneric(String nameOfDevice) {
        this.nameOfDevice = nameOfDevice;
    }

    public abstract void display();

    public WeatherDataDetails getWeatherDataDetails() {
        return weatherDataDetails;
    }
    public void updateWeatherDetails(WeatherDataDetails details) {
        weatherDataDetails = details;
    }
    public String getName() {
        return nameOfDevice;
    }
}
