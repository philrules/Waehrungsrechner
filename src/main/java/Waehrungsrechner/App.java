package Waehrungsrechner;


public class App 
{
    public static void main( String[] args )
    {
        WR euro2Dollar = new Euro2Dollar();
        
        euro2Dollar.addSuccessor(new Euro2Yen());
        euro2Dollar.addSuccessor(new Euro2Pfund());
        WR wr = euro2Dollar;

        wr = new DecoratorGebuehr(wr);
        wr = new DecoratorAusgabe(wr);

        UmrechnenCommand e2d = new UmrechnenCommand(wr, 500, "Euro zu Dollar");
        UmrechnenCommand e2y = new UmrechnenCommand(wr, 1000, "Euro zu Yen");
        UmrechnenCommand e2p = new UmrechnenCommand(wr, 10000, "Euro zu Pfund");

        e2d.execute();

        e2y.execute();

        e2p.execute();


        ISammelumrechnung sr = new Adapter(euro2Dollar);
        double[] betraege = {12.3, 456.6, 789.9, 9999.9};
        double result = sr.sammelumrechnen(betraege, "Euro zu Dollar");
        System.out.println("Ausgabe der Sammelumrechnung: "+result);


    }
    
}
