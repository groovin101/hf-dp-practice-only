package bart.observer.model;

import org.junit.Test;

import java.util.Observer;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class WeatherDataCoordinatorTest {

    private WeatherDataCoordinator weatherDataCoordinator;

    @Test
    public void notifyObservers_passesNewValuesToAllObservers() {
        weatherDataCoordinator = new WeatherDataCoordinator();
        Observer blimp = new DisplayDeviceBlimp("blimpy");
        weatherDataCoordinator.addObserver(blimp);
        weatherDataCoordinator.notifyObservers(new WeatherDataDetails(6.0, 6.0, 6.0));
        assertEquals("Should now have our new value", 6.0, ((DisplayDevice)blimp).getWeatherDataDetails().getTempCurrent());
    }
}