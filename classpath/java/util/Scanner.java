package java.util;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.regex.Pattern;


public class Scanner {

    private Pattern delimPattern;
    private BufferedReader reader;

    public Scanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
    }

    public String nextLine() {
        String nextLine;
        try {
            nextLine = reader.readLine();
        } catch (Exception e) {
            return "Error: scanner IO problem";
        }
        return nextLine;
    }

    public Scanner useDelimiter(String delim) {
        delimPattern = Pattern.compile(delim);
        return this;
    }

    public String next() {
        return null;
    }
}