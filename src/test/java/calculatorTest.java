import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }



    @Test
    public void add(){
        assertEquals(5, this.calculator.add(2, 3), 0.01);
    }

    @Test
    public void substract(){
        assertEquals(4, calculator.substract(6, 2),0.01);
    }

    @Test
    public void multiply(){
        assertEquals(14, calculator.multiply(7,2), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(1.5, calculator.divide(3, 2), 0.01);
    }




}
