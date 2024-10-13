package rs.raf;

import chat.parser.ChatLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var filename = "code/log.chat";

        try {
            CharStream str = CharStreams.fromFileName(filename);
            var tokens = new ChatLexer(str).getAllTokens();
            System.out.println(tokens);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit (1);
        }
    }
}