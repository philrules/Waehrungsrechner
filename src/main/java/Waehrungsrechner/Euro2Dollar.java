package Waehrungsrechner;

public class Euro2Dollar extends WR {

	protected String variante = "Euro zu Dollar";
	private double kurs = 0.8;

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
