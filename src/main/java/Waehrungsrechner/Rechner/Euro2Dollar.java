package Rechner;

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
/*Währungsrechner (Euro2Yen) (Euro2Dollar) abgeleitet von abstrakten Klasse
Währungsrechner implementiert IUmrechnen.
Währungsrechner hat als Datenfeld zumindest „Währung“ und den nächsten 
Währungsrechner. In abstrakter IUmrechnen wird geprüft ob Parameter 
„variante“ mit „Währung“ übereinanderstimmt, wenn ja wird umgerechnet, 
in neuer Methode, welche in den konkreten Wärhungsrechnern ausprogrammiert 
wird (Template Hook). Wenn nicht, wird der Betrag & Variante an den nächsten 
Währungsrechner weitergegeben (Chain of Respo). Die Decoratoren müssen 
glaub ich den ersten Währungsrechner als Datenfeld haben, der gibt dann 
einfach den Text beim Aufruf von IUmrechnen aus. Command haben wir nie 
gemacht, bin mir da nicht 100% sicher. Aber glaube du brauchst da eine 
Klasse welche den Währungsrechner aufruft und dabei die Daten logt. 
Die Logeinträge mit einem DAO zu speichern würde ich, wenn er nicht 
darauf besteht das es wirklich in einer Datenbank ist, einfach in einer 
Klasse mit nem Array speichern. Welches halt die CRUD Funktionen hat. 
Währungsrechner braucht dann auch eine List der ausgeführten Umrechnungen 
für die Redo/Undo Funktion. Beim Adapter stellst glaub ich eine Klasse 
bereit, welche ISammelumrechnen implementiert. Diese kann denk ich mal 
die Beträge addieren und dann den Währungsrechner aufrufen. 
Externe Anwendungen würden dann den Adapter als Datenfeld haben. 
(aber auch hier nicht zu 100% sicher)*/