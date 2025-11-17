package iths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
   @Test 
   void testAddition(){
   
    
assertEquals (3,Calculator.add(1, 2));
assertEquals(3, Calculator.add(2,1));
   }
   @Test 
   void SubstractTwomiunsOne(){
      int expected = 1;
      int actual = Calculator.subtract(2,1);
      assertEquals(expected, actual, "Subtraktion av 2-1 borde bli 1.");
   }
   @Test 
   void Multiplication(){
      assertEquals(6,Calculator.multiply(2, 3));
   }
   @Test void addNegativeNrAndPositiveNr_ReturnSum(){
   int expected = 5;
   int actual =Calculator.add(-5,10);
   assertEquals(expected,actual,"-5 +10 borde bli 5");
   }

   @Test
   void divideTenByTwoOutcomeFive(){
      double expected = 5;
      double actual = Calculator.divide(10, 2);
      double delta = 0;
      assertEquals(expected,actual,delta,"10 delat på 2 ska bli 5");
   }
   @Test
   void divideTenByThreeTestingDelta(){
      double expected =3.333333;
      double actual =Calculator.divide(10, 3);
      double delta = 0.000001;
      assertEquals(expected,actual,delta,"10 delat på 3 ska bli 3.33"); 
   }
   @Test
   void divideByZeroShallThrowException(){
      Class<IllegalArgumentException> expectedException = IllegalArgumentException.class;
      assertThrows(expectedException,()->{
         Calculator.divide(10,0);
      },"Division by zero is not allowed");
      
   }

}
