package bart.command.model;

import hf.command.remote.GarageDoor;

/**
 */
public class CommandGarageDoorOpen implements Command {

    private GarageDoor receiver;

    public CommandGarageDoorOpen(GarageDoor garageDoor) {
        receiver = garageDoor;
    }

    public void execute() {
        receiver.up();
    }
}
