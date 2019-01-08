package Rechner;


public class App 
{
    public static void main( String[] args )
    {
        WR e2d = new Euro2Dollar();
        
        e2d.addSuccessor(new Euro2Yen());
        WR wr = e2d;
        
        wr = new DecoratorGebuehr(wr);
        wr = new DecoratorAusgabe(wr);
       
        wr.umrechnen("Euro zu Yen", 100);
        wr.umrechnen("Euro zu Dollar", 100);
    }
    
}
