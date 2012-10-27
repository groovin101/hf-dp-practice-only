package bart.observer.model;

/**
 *
 */
public interface DisplayDevice {

    public void display();
    public WeatherDataDetails getWeatherDataDetails();
    public void updateWeatherDetails(WeatherDataDetails details);
}
