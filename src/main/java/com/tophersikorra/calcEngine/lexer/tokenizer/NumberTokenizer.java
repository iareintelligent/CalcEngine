package main.java.com.tophersikorra.calcEngine.lexer.tokenizer;

import main.java.com.tophersikorra.calcEngine.lexer.token.Token;
import main.java.com.tophersikorra.calcEngine.lexer.token.TokenId;

public class NumberTokenizer {

    public Token NumberTokenizer(String tokenStream) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tokenStream.length(); i++) {
            switch(tokenStream.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    sb.append(tokenStream.charAt(i));
                    break;
                default:

            }
        }

        return new Token(sb.toString(), TokenId.NUMBER);

    }

}
