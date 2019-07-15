import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100,500);
    }

    @Test
    public void printed(){
        assertEquals(80, printer.print(2, 10));
        assertEquals(480, printer.getToner());
    }

    @Test
    public void notPrinted(){
        Printer lotsCopies = new Printer (100,500);
        assertEquals(100, lotsCopies.print(20, 6));
        assertEquals(500, lotsCopies.getToner());
    }

}
