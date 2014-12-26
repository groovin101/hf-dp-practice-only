package bart.command.model;

import hf.command.remote.Light;

/**
 */
public class CommandLightOn implements Command {

    private Light receiver;

    public CommandLightOn(Light light) {
        this.receiver = light;
    }

    public void execute() {
        receiver.on();
    }

    public void undo() {
        receiver.off();
    }
}
