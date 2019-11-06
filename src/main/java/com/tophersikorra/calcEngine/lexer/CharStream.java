package main.java.com.tophersikorra.calcEngine.lexer;

//Topher Sikorra
//5 Nov 2019

public class CharStream {
    private final String text;
    private int pointer = 0;

    public CharStream(final String text) {
        this.text = text;
    }

    public char peek() {
        return text.charAt(pointer);
    }

    public char next() {
        final char next = peek();
        pointer++;

        return next;
    }
}
