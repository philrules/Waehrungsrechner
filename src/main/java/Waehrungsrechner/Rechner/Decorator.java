package Rechner;

public abstract class Decorator extends WR {

	protected WR wr;
	
	public Decorator(WR wr) {
		this.wr = wr;	
	}
	
	public double umrechnen(String variante, double betrag) {
		return wr.umrechnen(variante, betrag);
	}
	
	@Override
	public String getVariante() {
		
		return wr.getVariante();
	}

	@Override
	public double getKurs() {
		
		return wr.getKurs();
	}	
}
