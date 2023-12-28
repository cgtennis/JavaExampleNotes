package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher m = pattern.matcher("Hello");
        while (m.find())
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
    }
}
