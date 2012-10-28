package bart.observer.model;

/**
 *
 */
public class DisplayDeviceBlimp extends DisplayDeviceGeneric {

    public DisplayDeviceBlimp(String nameOfDevice) {
        super(nameOfDevice);
    }

    @Override
    public void display() {
        System.out.println(getName() + " says : ");
        System.out.println("<bigAssBlimpFont>" + buildTemperatureString() + "</bigAssBlimpFont>");
        System.out.println("------------");
    }

    private String buildTemperatureString() {
        return weatherDataDetails == null ? "Sorry people down there - no temp available" : new Double(weatherDataDetails.getTempCurrent()).toString();
    }
}
