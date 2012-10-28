package bart.observer.model;

/**
 * Used as the OBSERVER in the subject/observer relationship.
 *
 * Note: could have used java.util.Observer interface to make it clearer that this is an Observer
 * @see java.util.Observer
 */
public interface DisplayDevice {

    public void display();
    public WeatherDataDetails getWeatherDataDetails();
    public void updateWeatherDetails(WeatherDataDetails details);
    public String getName();
}
