package iths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {
    @Test
void GetScoreZero(){
    char expected = 'F';
    char actual =GradeCalculator.getGrade(0);
    assertEquals(expected,actual,"Score Zero should trigger an F");
}
@Test
void GetScoreBelowZero_ReturnExeption(){
Class <IllegalArgumentException> expectedExeption = IllegalArgumentException.class;
assertThrows(expectedExeption, ()->{
    GradeCalculator.getGrade(-1);
},"Score -1 ska ge exceptoíon");
    

}
}
