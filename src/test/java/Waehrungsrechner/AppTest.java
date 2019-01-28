package Waehrungsrechner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private Euro2Dollar e = null;

    @Before
    public void setUp(){
        WR euro2Dollar = new Euro2Dollar();

        euro2Dollar.addSuccessor(new Euro2Yen());
        euro2Dollar.addSuccessor(new Euro2Pfund());
        WR wr = euro2Dollar;

        wr = new DecoratorGebuehr(wr);
        wr = new DecoratorAusgabe(wr);

        UmrechnenCommand e2d = new UmrechnenCommand(wr, 500, "Euro zu Dollar");
        UmrechnenCommand e2y = new UmrechnenCommand(wr, 1000, "Euro zu Yen");
        UmrechnenCommand e2p = new UmrechnenCommand(wr, 10000, "Euro zu Pfund");
    }

    @Test
    public void testConvert()
    {
        assertEquals(380, e.convert(500));
    }
}
