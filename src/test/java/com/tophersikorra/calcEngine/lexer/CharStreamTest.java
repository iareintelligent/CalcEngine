package test.java.com.tophersikorra.calcEngine.lexer;

import main.java.com.tophersikorra.calcEngine.lexer.CharStream;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CharStreamTest {

    @Test
    public void CharStreamNextTest() {
        CharStream expression = new CharStream("3x5");
        assertEquals('3', expression.next());
        assertEquals('x', expression.next());
        assertEquals('3', expression.next());
    }

}
