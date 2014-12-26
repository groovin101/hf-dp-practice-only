package bart.command.model;

/**
 * Invoker
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command emptyCommand = new CommandEmpty();

        for (int i=0; i<onCommands.length; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }
    }

    public void setCommands(int index, Command onCommand, Command offCommand) {
        setOnCommand(index, onCommand);
        setOffCommand(index, offCommand);
    }

    public void setOnCommand(int index, Command command) {
        onCommands[index] = command;
    }
    public void setOffCommand(int index, Command command) {
        offCommands[index] = command;
    }

    public void pressOnButton(int index) {
        System.out.println("> " + index + " ON: ");
        onCommands[index].execute();
    }

    public void pressOffButton(int index) {
        System.out.println("> " + index + " OFF: ");
        offCommands[index].execute();
    }

    @Override
    public String toString() {

        StringBuffer out = new StringBuffer("-- RemoteControl --\n");
        for (int i=0; i<onCommands.length;i++) {
            out.append(i + ") ON:  " + onCommands[i].getClass().getSimpleName());
            out.append("\n");
            out.append(i + ") OFF: " + offCommands[i].getClass().getSimpleName());
            out.append("\n");
        }
        return out.toString();
    }
}
