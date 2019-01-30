package Waehrungsrechner;

public class DecoratorAusgabe extends Decorator {
	
	public DecoratorAusgabe(WR wr) {
		super(wr);
	}
	
	@Override
	public double umrechnen(String variante, double betrag) {
		double ergebnis = wr.umrechnen(variante, betrag);
		
		System.out.println("Umrechnugsvorgang, " + variante + " mit dem Betrag " + betrag + " Euro und einer Gebühr von 5%.");
		System.out.println("Ergebnis " + ergebnis);

		return ergebnis;
	}
}
