import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void addTest() {
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void minusTest(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,2);
        assertTrue(result == 8);
    }
}