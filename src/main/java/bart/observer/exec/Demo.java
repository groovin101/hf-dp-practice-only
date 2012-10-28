package bart.observer.exec;

import bart.observer.model.DisplayDeviceBlimp;
import bart.observer.model.DisplayDevicePhone;
import bart.observer.model.WeatherDataCoordinator;
import bart.observer.model.WeatherDataDetails;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        WeatherDataCoordinator dataCoordinator = new WeatherDataCoordinator(new WeatherDataDetails(57.1, 50.0, 72.9));
        DisplayDeviceBlimp blimp = new DisplayDeviceBlimp("blimpikus");
        DisplayDevicePhone phone = new DisplayDevicePhone("phonikus");
        dataCoordinator.registerObserver(blimp);
        dataCoordinator.registerObserver(phone);

        blimp.display();
        phone.display();

        dataCoordinator.updateData(new WeatherDataDetails(42, 42, 42));

        blimp.display();
        phone.display();
    }
}
