package Waehrungsrechner;

public class Euro2Pfund extends WR{

    protected String variante = "Euro zu Pfund";
    private double kurs = 1.3;

    public String getVariante() {
        return variante;
    }
    public void setVariante(String variante) {
        this.variante = variante;
    }
    public double getKurs() {
        return kurs;
    }
    public void setKurs(double kurs) {
        this.kurs = kurs;
    }
}
