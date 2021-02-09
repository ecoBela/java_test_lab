import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() {printer = new Printer(75, 25);}

    @Test
    public void hasPaper(){
        assertEquals(75, printer.getPaper());

    }
}
