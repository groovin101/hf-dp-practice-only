package bart.command;

import bart.command.model.*;
import hf.command.remote.Stereo;
import hf.command.remote.GarageDoor;
import hf.command.remote.Light;

/**
 * The command pattern decouples the implementation of a command from the invoker, meaning the invoker does not have to
 * have any knowledge of the commands it is executing. Like a waitress handing off Orders to a Cook, or a remote control
 * firing Commands that themselves are device and implementation aware. The commands are simply registered and invoked
 * as needed.
 */
public class DemoCommandPattern {

    public static void main(String[] args) {

        RemoteControl rc = new RemoteControl();

        Light lightInTheOuthouse = new Light("Outhouse");
        GarageDoor garageDoorAtCootersHouse = new GarageDoor("Cooter's");
        Stereo stereoInOffice = new Stereo("Man Cave");

        rc.setCommands(0, new CommandLightOn(lightInTheOuthouse), new CommandLightOff(lightInTheOuthouse));
        rc.setOnCommand(1, new CommandGarageDoorOpen(garageDoorAtCootersHouse));
        rc.setCommands(2, new CommandStereoCdOn(stereoInOffice), new CommandStereoCdOff(stereoInOffice));

        System.out.println(rc);

        rc.pressOnButton(0);
        rc.pressOffButton(0);
        rc.pressOnButton(1);
        rc.pressOffButton(1);
        rc.pressOnButton(2);
        rc.pressOffButton(2);
    }
}
