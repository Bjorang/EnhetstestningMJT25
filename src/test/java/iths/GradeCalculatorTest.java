package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {
    @Test
    void getScoreZero() {
        char expected = 'F';
        char actual = GradeCalculator.getGrade(0);
        assertEquals(expected, actual, "Score Zero should trigger an F");
    }

    @Test
    void getScoreBelowZero_ReturnExeption() {
        Class<IllegalArgumentException> expectedExeption = IllegalArgumentException.class;
        assertThrows(expectedExeption, () -> {
            GradeCalculator.getGrade(-1);
        }, "Score -1 ska ge exceptoíon");

    }

    @Test
    void getScoreOverHundred_ThrowsException(){
        Class<IllegalArgumentException> expectedException = IllegalArgumentException.class;
        assertThrows(expectedException, ()-> {
            GradeCalculator.getGrade(101);
        },"Score 101 shall throw Exception");
    }
    @Test 
    void getScoreSixty_ReturnD(){
        char expected ='D'; 
        char actual = GradeCalculator.getGrade(60);
        assertEquals(expected, actual, "Score 60 should give grade D");
    }

}
