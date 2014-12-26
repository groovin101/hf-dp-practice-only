package bart.command.model;

/**
 */
public class CommandMacro implements Command {

    Command[] commandsToExecute;

    public CommandMacro(Command[] commandsToExecute) {
        this.commandsToExecute = commandsToExecute;
    }

    public void execute() {
        for (Command command: commandsToExecute) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command: commandsToExecute) {
            command.undo();
        }
    }
}
