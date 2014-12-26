package bart.command.model;

import hf.command.undo.CeilingFan;

/**
 */
public class CommandCeilingFanMediumOn implements Command {

    private int previousSpeedWeWillNeedToRestoreOnUndo;
    private CeilingFan receiver;

    public CommandCeilingFanMediumOn(CeilingFan fan) {
        receiver = fan;
    }

    public void execute() {
        previousSpeedWeWillNeedToRestoreOnUndo = receiver.getSpeed();
        receiver.medium();
    }

    public void undo() {
        if (previousSpeedWeWillNeedToRestoreOnUndo == CeilingFan.OFF) {
            receiver.off();
        }
        else if (previousSpeedWeWillNeedToRestoreOnUndo == CeilingFan.LOW) {
            receiver.low();
        }
        else if (previousSpeedWeWillNeedToRestoreOnUndo == CeilingFan.MEDIUM) {
            receiver.medium();
        }
        else if (previousSpeedWeWillNeedToRestoreOnUndo == CeilingFan.HIGH) {
            receiver.high();
        }
    }

}
