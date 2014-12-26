package bart.command.model;

import hf.command.remote.Stereo;

/**
 */
public class CommandStereoCdOn implements Command {

    private Stereo receiver;

    public CommandStereoCdOn(Stereo stereo) {
        receiver = stereo;
    }

    public void execute() {
        receiver.on();
        receiver.setCD();
        receiver.setVolume(10);
    }
}
