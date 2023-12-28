package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileWatcherDateToken {
    public static void main(String[] args) throws Exception {
        Pattern pattern;
        Matcher matcher;
        String searchString;
        String text;
        text = "Pre_{today:mmddyyyy}_middle_{prevBizDay:yyyy-mm-dd}_suffix";
        searchString = "\\{([\\s|\\S][^\\{\\}]*)\\}";
        pattern = Pattern.compile(searchString);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Start index: "+matcher.start());
            System.out.println("End index: "+matcher.end());
            System.out.println("Found: " + matcher.group(0));  //implicit group
            System.out.println("Found: " + matcher.group(1)); //explicit group
        }
    }
}