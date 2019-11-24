import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.time.LocalTime.*;

public class dateTime {

    public static void main(String[] args) throws ParseException {

        calculateFlightDuration();                                                       // first task

        getWeekDay("25/5/1977");                                           // second task(day of release)

        Date startDate = new Date(1977, 5, 25);                        // how many times in first 2 years
        Date endDate = new Date(1979, 5, 25);
        int weekendDays = getWeekendDaysBetweenTwoDates(startDate, endDate);
        System.out.println("\n In first two years it played " + (weekendDays+1) + " times.");

        int playsInFirstYear = weekendDays / 2 + 1;                                     // how many hours, minutes in first year
        calculatePlayDuration(playsInFirstYear);

    }

    static void calculateFlightDuration() {
        ZonedDateTime timeDeparted = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2019, 11, 13),
                of(11, 15)), ZoneId.of("Australia/Sydney"));

        ZonedDateTime timeArrived = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2019, 11, 13),
                of(06, 00)), ZoneId.of("America/Los_Angeles"));

        Duration durationOfFlight = Duration.between(timeDeparted, timeArrived);

        String timeDepartedStringFormat = timeDeparted.format(DateTimeFormatter.ofPattern("d-M-yyyy hh:mm a"));

        String timeArrivedStringFormat = timeArrived.format(DateTimeFormatter.ofPattern("d-M-yyyy hh:mm a"));

        System.out.println("Deparrture time :  " + timeDepartedStringFormat);
        System.out.println("Arriving time   :  " + timeArrivedStringFormat);

        long hours = durationOfFlight.toHours();
        int minutes = (int) ((durationOfFlight.getSeconds() % (60 * 60)) / 60);
        int seconds = (int) (durationOfFlight.getSeconds() % 60);
        System.out.println("Flight duration :  " + hours + ":" + minutes + ":" + seconds);
    }

    public static void getWeekDay(String dateTextFormat) throws ParseException {

        String output =
                LocalDate.parse(                                  // Generate `LocalDate` object from String input.
                        dateTextFormat,
                        DateTimeFormatter.ofPattern("d/M/uuuu")
                )
                        .getDayOfWeek()                           // Get `DayOfWeek` enum object.
                        .getDisplayName(                          // Localize. Generate a String to represent this day-of-week.
                                TextStyle.SHORT_STANDALONE,       // How long or abbreviated. Some languages have an alternate spelling for "standalone" use (not so in English).
                                Locale.US                         // Or Locale.CANADA_FRENCH and such. Specify a `Locale` to determine (1) human language for translation, and (2) cultural norms for abbreviation, punctuation, etc.
                        );
        System.out.println("\n Release day : " + output);
    }

    public static int getWeekendDaysBetweenTwoDates(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int restDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            System.out.println("Dates are equal !!!");
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }
        do {
            //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++restDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return restDays;
    }

    static void calculatePlayDuration(int days){
        long minutes = days * 120;
        long hours = minutes / 60;
        long minutesPlayed = minutes % 60;
        long daysPlayed = hours / 24;
        long hoursPlayed = hours % 24;

        System.out.println("Playing duration :  " + daysPlayed + " days, " + hoursPlayed + " hours and "  + minutesPlayed + " minutes");
    }

    public static int getWDaysBetweenTwoDates(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int restDays = 0;

    do {
        //excluding start date
        startCal.add(Calendar.DAY_OF_MONTH, 1);
        if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            ++restDays;
        }
    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return restDays;
}}
