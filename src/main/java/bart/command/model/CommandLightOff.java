package bart.command.model;

import hf.command.remote.Light;

/**
 */
public class CommandLightOff implements Command {

    private Light receiver;

    public CommandLightOff(Light light) {
        receiver = light;
    }

    public void execute() {
        receiver.off();
    }
    public void undo() {
        receiver.on();
    }
}
