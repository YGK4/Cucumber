package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    public static String datetimesec() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date-time to include seconds
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return now.format(formatter);
    }

    public static void main(String[] args) {
        // Call the datetimesec method
        String dateTimeWithSeconds = datetimesec();
        System.out.println("DateTime with Seconds: " + dateTimeWithSeconds);
    }
}

