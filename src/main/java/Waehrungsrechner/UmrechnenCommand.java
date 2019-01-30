package Waehrungsrechner;

public class UmrechnenCommand implements Command {


    private double betrag;
    private WR wr;
    private String variante;
    private UndoRedo ur;

    public UmrechnenCommand(WR wr, double betrag, String variante){
        this.wr = wr;
        this.betrag = betrag;
        this.variante = variante;
        ur = Singleton.getInstance();

    }

    public String execute() {
        ur.pushUndo(betrag);
        double oldBetrag = betrag;
        betrag = wr.umrechnen(variante, betrag);
        //wr.umrechnen(variante, betrag);

        return "Umrechnungsvorgang " + variante + " mit dem Betrag " + oldBetrag;
    }

    public void redo() {
        ur.pushUndo(betrag);
        Double temp = ur.redo();
        if(temp != null){
            betrag = temp;
        }
        System.out.println("Redo ausgeführt Betrag: "+ betrag);
    }

    public void undo() {
        ur.pushRedo(betrag);
        Double temp = ur.undo();
        if(temp != null){
            betrag = temp;
        }
        System.out.println("Undo ausgeführt Betrag: "+betrag);
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
