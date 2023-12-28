package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup {
    public static void main(String[] args) throws Exception {
        Pattern pattern;
        Matcher matcher;
        String searchString;
        String text;
        text = "Monday 12-9-2013";
        searchString = "(\\w+ \\d{1,2})-(\\d{1,2})-(\\d{4})";
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("found: " + matcher.group(0));
            System.out.println("found: " + matcher.group(1));
            System.out.println("found: " + matcher.group(2));
            System.out.println("found: " + matcher.group(3));
        }
        System.out.println("There are " + matcher.groupCount() + " groups in the pattern!");
    }
}