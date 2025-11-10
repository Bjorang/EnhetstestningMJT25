import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import iths.Calculator;
public class CalculatorTest {
   @Test 
   void testAddition(){
   
    
Assertions.assertEqual (3,Calculator.add(1, 2));
   }
}
