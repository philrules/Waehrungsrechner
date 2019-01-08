package Rechner;

public class DecoratorGebuehr extends Decorator {
	
	protected double gebuehr = 0.5;

	public DecoratorGebuehr(WR wr) {
		super(wr);
	}
	
	@Override
	public double umrechnen(String variante, double betrag) {
		
		betrag -= this.getGebuehr();
		
		
		return wr.umrechnen(variante, betrag);
	}

	public double getGebuehr() {
		return gebuehr;
	}

	public void setGebuehr(double gebuehr) {
		this.gebuehr = gebuehr;
	}
}
