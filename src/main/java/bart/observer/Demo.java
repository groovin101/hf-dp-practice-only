package bart.observer;

import bart.observer.model.DisplayDeviceBlimp;
import bart.observer.model.DisplayDevicePhone;
import bart.observer.model.WeatherDataCoordinator;
import bart.observer.model.WeatherDataDetails;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        WeatherDataCoordinator dataCoordinator = new WeatherDataCoordinator();
        DisplayDeviceBlimp blimp = new DisplayDeviceBlimp("blimpikus");
        DisplayDevicePhone phone = new DisplayDevicePhone("phonikus");
        dataCoordinator.addObserver(blimp);
        dataCoordinator.addObserver(phone);

        blimp.display();
        phone.display();

        dataCoordinator.notifyObservers(new WeatherDataDetails(42, 42, 42));

        blimp.display();
        phone.display();
    }
}
