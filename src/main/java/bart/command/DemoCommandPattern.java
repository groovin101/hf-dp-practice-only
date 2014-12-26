package bart.command;

import bart.command.model.*;
import hf.command.remote.GarageDoor;
import hf.command.remote.Light;
import hf.command.remote.Stereo;
import hf.command.undo.CeilingFan;

/**
 * The command pattern decouples the implementation of a command from the invoker, meaning the invoker does not have to
 * have any knowledge of the commands it is executing. Like a waitress handing off Orders to a Cook, or a remote control
 * firing Commands that themselves are device and implementation aware. The commands are simply registered and invoked
 * as needed.
 */
public class DemoCommandPattern {

    public static void main(String[] args) {

        tryButtonPressing();
        trySimpleUndoButton();
        tryComplexUndoButton();
    }

    private static void tryButtonPressing() {

        RemoteControl rc = assignCommandsToButtons();
        System.out.println(rc);

        rc.pressOnButton(0);
        rc.pressOffButton(0);
        rc.pressOnButton(1);
        rc.pressOffButton(1);
        rc.pressOnButton(2);
        rc.pressOffButton(2);
    }

    private static void trySimpleUndoButton() {

        RemoteControl rc = assignCommandsToButtons();
        System.out.println(rc);

        rc.pressOnButton(0);
        rc.pressOffButton(0);
        rc.pressUndoButton();

        rc.pressOffButton(0);
        rc.pressOnButton(0);
        rc.pressUndoButton();
    }

    private static void tryComplexUndoButton() {

        RemoteControl rc = new RemoteControl();

        CeilingFan fan = new CeilingFan("Kitchen");
        rc.setCommands(0, new CommandCeilingFanLowOn(fan), new CommandCeilingFanOff(fan));
        rc.setCommands(1, new CommandCeilingFanMediumOn(fan), new CommandCeilingFanOff(fan));
        rc.setCommands(2, new CommandCeilingFanHighOn(fan), new CommandCeilingFanOff(fan));

        //turn on med
        rc.pressOnButton(1);
        //turn off
        rc.pressOffButton(1);
        //undo off (go back to medium)
        rc.pressUndoButton();

        //turn on high
        rc.pressOnButton(2);
        //undo high (go back to medium)
        rc.pressUndoButton();
    }

    private static RemoteControl assignCommandsToButtons() {

        RemoteControl rc = new RemoteControl();

        Light lightInTheOuthouse = new Light("Outhouse");
        GarageDoor garageDoorAtCootersHouse = new GarageDoor("Cooter's");
        Stereo stereoInOffice = new Stereo("Man Cave");

        rc.setCommands(0, new CommandLightOn(lightInTheOuthouse), new CommandLightOff(lightInTheOuthouse));
        rc.setOnCommand(1, new CommandGarageDoorOpen(garageDoorAtCootersHouse));
        rc.setCommands(2, new CommandStereoCdOn(stereoInOffice), new CommandStereoCdOff(stereoInOffice));

        return rc;
    }
}
