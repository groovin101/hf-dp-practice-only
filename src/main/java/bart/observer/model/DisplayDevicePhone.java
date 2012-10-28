package bart.observer.model;

/**
 *
 */
public class DisplayDevicePhone extends DisplayDeviceGeneric {

    public DisplayDevicePhone(String nameOfDevice) {
        super(nameOfDevice);
    }

    @Override
    public void display() {
        System.out.println(getName() + " says : ");
        System.out.println("Current temp is <tinyPhoneFont>" + buildTemperatureString() + "</tinyPhoneFont>");
        System.out.println("------------");
    }

    private String buildTemperatureString() {
        return weatherDataDetails == null ? "N/A" : new Double(weatherDataDetails.getTempCurrent()).toString();
    }

}
