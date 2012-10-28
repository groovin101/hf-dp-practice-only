package bart.observer.model;

import java.util.Observable;

/**
 * Master object to track temp, humidity, and pressure coming from the weather station. Pushes this data to
 * individual displays. This is the SUBJECT in the Subject/Observer relationship.
 *
 * Note that this could have used the built in (java6) Observable class.
 * @see java.util.Observable
 */
public class WeatherDataCoordinator extends Observable {

    @Override
    public void notifyObservers(Object weatherDetails) {
        setChanged();
        super.notifyObservers(weatherDetails);    //To change body of overridden methods use File | Settings | File Templates.
    }
}