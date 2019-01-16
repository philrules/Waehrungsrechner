package Rechner;


public class App 
{
    public static void main( String[] args )
    {
        WR euro2Dollar = new Euro2Dollar();
        
        euro2Dollar.addSuccessor(new Euro2Yen());
        WR wr = euro2Dollar;
        
        wr = new DecoratorGebuehr(wr);
        wr = new DecoratorAusgabe(wr);

        UmrechnenCommand e2d = new UmrechnenCommand(wr, 10000, "Euro zu Dollar");
        UmrechnenCommand e2y = new UmrechnenCommand(wr, 10000, "Euro zu Yen");
        e2d.execute();
        e2y.execute();
    }
    
}
