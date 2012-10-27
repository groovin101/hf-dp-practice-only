package bart.observer.model;

/**
 *
 */
public class DisplayDeviceNamedImpl extends DisplayDeviceNamed {

    private WeatherDataDetails weatherDataDetails;

    public DisplayDeviceNamedImpl(String nameOfDevice) {
        super(nameOfDevice);
    }

    public void display() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    public WeatherDataDetails getWeatherDataDetails() {
        return weatherDataDetails;
    }
    public void updateWeatherDetails(WeatherDataDetails details) {
        weatherDataDetails = details;
    }
}
