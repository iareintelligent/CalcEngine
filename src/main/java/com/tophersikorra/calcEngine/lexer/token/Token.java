package main.java.com.tophersikorra.calcEngine.lexer.token;

public class Token {
    private final String value;
    private final TokenId id;

    public Token(final String value, final TokenId id) {
        this.value = value;
        this.id = id;
    }

    public String getValue() { return value; }
    public TokenId getId() { return id; }

}
