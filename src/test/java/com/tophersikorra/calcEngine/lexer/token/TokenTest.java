package test.java.com.tophersikorra.calcEngine.lexer.token;

import main.java.com.tophersikorra.calcEngine.lexer.token.Token;
import main.java.com.tophersikorra.calcEngine.lexer.token.TokenId;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TokenTest {

     @Test
    public void basicTest() {
         final Token token = new Token("20.2", TokenId.NUMBER);
         assertEquals("20.2", token.getValue());
         assertEquals(TokenId.NUMBER, token.getId());
     }

}