package Waehrungsrechner;

public interface Command {

    public String execute();
    public void redo();
    public void undo();
}
