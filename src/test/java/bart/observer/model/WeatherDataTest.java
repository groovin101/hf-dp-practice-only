package bart.observer.model;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertTrue;

/**
 *
 */
public class WeatherDataTest {

    @Test
    public void testDisplayCurrentConditions_sendsToAllListeners() {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(buildDisplayDeviceWithEmptyImplForTest("device 1"));
        weatherData.registerObserver(buildDisplayDeviceWithEmptyImplForTest("device 2"));
        assertTrue("Should be listening to device 1", observersInclude("device 1", weatherData.getObservers()));
        assertTrue("Should be listening to device 2", observersInclude("device 2", weatherData.getObservers()));
    }

    @Test
    public void measurementsChanged_passesNewValuesToAllObservers() {

    }

    private boolean observersInclude(String nameOfDevice, List<DisplayDevice> observers) {
        if (observers != null) {
            for (DisplayDevice device : observers) {
                if (((DisplayDeviceNamed)device).getNameOfThisDevice().equals(nameOfDevice)) {
                    return true;
                }
            }
        }
        return false;
    }

    private DisplayDevice buildDisplayDeviceWithEmptyImplForTest(String nameOfDevice) {
        return new DisplayDeviceNamed(nameOfDevice) {
            public void display() {
            }
        };
    }

}
