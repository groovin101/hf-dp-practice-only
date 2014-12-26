package bart.command.model;

import hf.command.remote.Stereo;

/**
 */
public class CommandStereoCdOff implements Command {

    private Stereo receiver;

    public CommandStereoCdOff(Stereo stereo) {
        receiver = stereo;
    }

    public void execute() {
        receiver.off();
    }

    public void undo() {
        new CommandStereoCdOn(receiver).execute();
    }
}
