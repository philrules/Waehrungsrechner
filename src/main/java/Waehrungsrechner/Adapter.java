package Waehrungsrechner;

public class Adapter implements ISammelumrechnung {

    private WR wr;


    public Adapter(WR wr) {
        this.wr = wr;
    }

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double ergebnis = 0;
        for(double betrag : betraege){
            ergebnis += wr.umrechnen(variante, betrag);
        }
        return ergebnis;
    }
}
