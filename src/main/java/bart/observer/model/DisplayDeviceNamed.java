package bart.observer.model;

/**
 * A named display device
 */
public abstract class DisplayDeviceNamed implements DisplayDevice {

    private String nameOfThisDevice;


    public DisplayDeviceNamed(String nameOfDevice) {
        this.nameOfThisDevice = nameOfDevice;
    }

    public String getNameOfThisDevice() {
        return nameOfThisDevice;
    }
}
