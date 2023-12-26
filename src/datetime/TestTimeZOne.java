package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * We should use the new java.time.* package instead of the old java.util.*
 */

public class TestTimeZOne {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss a";

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Local time now: "+ now.format((formatter)));

        ZoneId estZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone : " + estZoneId);

        ZoneId cstZoneId = ZoneId.of("America/Chicago");
        System.out.println("TimeZone : " + cstZoneId);

        ZoneId utcZoneId = ZoneId.of("UTC");
        System.out.println("TimeZone : " + utcZoneId);

        //Get local system default ZonedDateTIme, then use .withZoneSameInstant method
        ZonedDateTime localZonedTime = now.atZone(ZoneId.systemDefault());
        System.out.println("Local Zone: "+ZoneId.systemDefault());
        System.out.println("Local Zoned Time: "+localZonedTime.format(formatter));
        System.out.println("CST Zoned Time: "+localZonedTime.withZoneSameInstant(cstZoneId).format(formatter));
        System.out.println("UTC Zoned Time: "+localZonedTime.withZoneSameInstant(utcZoneId).format(formatter));

        //first obtain the Instant corresponding to the LocalDateTime and then use it to create a ZonedDateTime
        Instant instant = now.atZone(ZoneId.systemDefault()).toInstant();
        ZonedDateTime cstDateTime = instant.atZone(ZoneId.of("America/Chicago"));
        ZonedDateTime utcDateTime = instant.atZone(ZoneId.of("UTC"));
        System.out.println("CST Zoned Time: "+cstDateTime.format(formatter));
        System.out.println("UTC Zoned Time: "+utcDateTime.format(formatter));


    }
}
