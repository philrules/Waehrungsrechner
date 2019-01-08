package Rechner;

public abstract class WR implements IUmrechnen{

	private String waehrung;
	private WR nextWR;
	
	public double umrechnen(String variante, double betrag){   
		double ergebnis = 0;
		
		if(variante.equals(this.getVariante())){
	         ergebnis = this.logConversion(betrag);   
	      }
		else if(nextWR != null){
	    	ergebnis = nextWR.umrechnen(variante, betrag);
	      }
		
        return ergebnis;    
    }

	public String getWaehrung() {
		return waehrung;
	}

	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}

	public WR getNextWR() {
		return nextWR;
	}

	public void setNextWR(WR nextWR) {
		this.nextWR = nextWR;
	}
	
	public double logConversion(double amount) {
		double ergebnis = amount*this.getKurs();
		return ergebnis;
	}
	
	public void addSuccessor(WR nextWR){
        WR next = this;
        while (next.hasNextWR()){
            next = next.getNextWR();
        }
        next.setNextWR(nextWR);
    }
	
	private boolean hasNextWR() {
        boolean wrBoolean = false;
        if (this.nextWR != null){
        	wrBoolean = true;
        }
        return wrBoolean;
    }
	
	public abstract String getVariante();
	
	public abstract double getKurs();
	
}
