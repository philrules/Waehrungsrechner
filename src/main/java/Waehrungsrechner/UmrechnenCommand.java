package Waehrungsrechner;

public class UmrechnenCommand extends UndoRedo implements Command {

    private double betrag;
    private WR wr;
    private String variante;

    public UmrechnenCommand(WR wr, double betrag, String variante){
        super();
        this.wr = wr;
        this.betrag = betrag;
        this.variante = variante;
        thingsToUndo.push(this);
    }

    public void execute() {
        wr.umrechnen(variante, betrag);
    }

    public void redo() {


    }

    public void undo() {

    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
}
