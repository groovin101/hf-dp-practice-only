package bart.observer.model;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.*;

/**
 *
 */
public class WeatherDataCoordinatorTest {

    private WeatherDataCoordinator weatherDataCoordinator;
    private static final double INIT_TEMP = 90.1;

    @Before
    public void setup() {
        WeatherDataDetails data = new WeatherDataDetails(INIT_TEMP, 23.3, 100);
        weatherDataCoordinator = new WeatherDataCoordinator(data);
        weatherDataCoordinator.registerObserver(buildDisplayDeviceWithEmptyImplForTest("device 1"));
        weatherDataCoordinator.registerObserver(buildDisplayDeviceWithEmptyImplForTest("device 2"));
    }

    @Test
    public void testDisplayCurrentConditions_sendsToAllListeners() {
        assertTrue("Should be listening to device 1", observersInclude("device 1", weatherDataCoordinator.getObservers()));
        assertTrue("Should be listening to device 2", observersInclude("device 2", weatherDataCoordinator.getObservers()));
    }

//    TODO: this is failing, but i know for a fact that this measurmentsChanged IS being called. whatup!!!!?
//    @Test
//    public void testSetWeatherDataDetails_callsMeasurementsChangedAfterWeUpdateWeatherDetails() {
//        WeatherDataCoordinator mockedDataCoordinator = mock(WeatherDataCoordinator.class);
//        mockedDataCoordinator.updateData(new WeatherDataDetails(1,2,3));
//        verify(mockedDataCoordinator).measurementsChanged();
//    }

    @Test
    public void addObserver_initializesCurrentWeatherDataInTheNewObserver() {
        DisplayDevice observingDevice = buildDisplayDeviceWithEmptyImplForTest("1");
        weatherDataCoordinator.registerObserver(observingDevice);
        DisplayDevice deviceAfterBeingAddedAsObserver = weatherDataCoordinator.getNamedObserver("1");
        assertNotNull("Should not be null", deviceAfterBeingAddedAsObserver.getWeatherDataDetails());
        assertEquals("Observer should have same vals as coordinator after being added", weatherDataCoordinator.getWeatherDataDetails().getTempCurrent(), deviceAfterBeingAddedAsObserver.getWeatherDataDetails().getTempCurrent());
    }

    @Test
    public void measurementsChanged_passesNewValuesToAllObservers() {
        DisplayDevice observer = weatherDataCoordinator.getObservers().get(0);
        WeatherDataDetails currentdataDetails = observer.getWeatherDataDetails();
        assertEquals("Should have the initial value that the coordinator was created with", INIT_TEMP, currentdataDetails.getTempCurrent());
        weatherDataCoordinator.updateData(new WeatherDataDetails(6.0, 6.0, 6.0));
        assertEquals("Should now have our new value", 6.0, weatherDataCoordinator.getObservers().get(0).getWeatherDataDetails().getTempCurrent());
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
        return new DisplayDeviceNamedImpl(nameOfDevice);
    }
}