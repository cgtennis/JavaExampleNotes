package datetime;

/**
 * We should use the new java.time.* package instead of the old java.util.*
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTime {

    public static void main(String[] args) {

//        LocalDateTime + DateTimeFormatter
/*
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before: "+now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println("After: "+formatDateTime);
*/

        //String -> LocalDateTime
/*        String now = "2016-11-09 10:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
        System.out.println("Before: "+ formatDateTime);
        System.out.println("After: "+formatDateTime.format(formatter));*/


    }
}
