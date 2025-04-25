package com.pluarslight;

// Import necessary classes for date/time and formatting
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDates {
    public static void main(String[] args) {

        // Step 1: Get the current local date and time (from your system clock)
        LocalDateTime now = LocalDateTime.now();

        // Step 2: Get the current date and time in GMT (Greenwich Mean Time)
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // Step 3: Format 1 - Display date as MM/dd/yyyy (e.g., 04/23/2025)
        System.out.println(now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        // Step 4: Format 2 - Display date as yyyy-MM-dd (e.g., 2025-04-23)
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // Step 5: Format 3 - Display date as full month name, day, and year (e.g., April 23, 2025)
        System.out.println(now.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));

        // Step 6: Format 4 - Display day of week, short month, day, year, and time in GMT
        // Example: Wednesday, Apr 23, 2025 14:10
        System.out.println(gmt.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm")));

        // Step 7: CHALLENGE - Display time in "H:mm on dd-MMM-yyyy" format using local time
        // Example: 14:10 on 23-Apr-2025
        System.out.println(now.format(DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy", Locale.ENGLISH)));
    }
}