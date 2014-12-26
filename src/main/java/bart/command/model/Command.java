package bart.command.model;

/**
 * All commands must be executable. Intent is to fire via an invoker, a remote control for example
 */
public interface Command {

    public void execute();
    public void undo();
}
