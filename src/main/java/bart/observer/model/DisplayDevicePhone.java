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
        System.out.println("<tinyPhoneFont>" + buildTemperatureString() + "</tinyPhoneFont>");
        System.out.println("------------");
    }

    private String buildTemperatureString() {
        return weatherDataDetails == null ? "Temp: not available Gabby McGabGab" : "Temp: " + new Double(weatherDataDetails.getTempCurrent()).toString();
    }

}
