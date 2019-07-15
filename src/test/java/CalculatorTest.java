import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3.2, 2.5);
    }

    @Test
    public void add(){
        assertEquals(5.7, calculator.addNum(), 0.01);
    }

    @Test
    public void subtract(){
        assertEquals(0.7, calculator.subtractNum(), 0.01);
    }

    @Test
    public void multiply(){
        assertEquals(8, calculator.multiplyNum(), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(1.28, calculator.divideNum(), 0.01);
    }


}
