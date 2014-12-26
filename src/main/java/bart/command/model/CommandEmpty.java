package bart.command.model;

/**
 */
public class CommandEmpty implements Command {

    public void execute() {
        System.out.println("No Command Implemented in this slot");
    }
}
