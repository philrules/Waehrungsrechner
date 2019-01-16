package Rechner;

public class UmrechnenCommand implements Command {

    private Euro2Dollar e2d;
    private double betrag;
    private WR wr;
    private String variante;

    public UmrechnenCommand(WR wr, double betrag, String variante){
        this.wr = wr;
        this.betrag = betrag;
        this.variante = variante;
    }

    public void execute() {
        wr.umrechnen(variante, betrag);
    }

    public void redo() {

    }

    public void undo() {

    }
}
