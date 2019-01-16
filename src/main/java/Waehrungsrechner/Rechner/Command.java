package Rechner;

public interface Command {

    public void execute();
    public void redo();
    public void undo();
}
