import java.time.*;
import java.time.format.DateTimeFormatter;
import static java.time.LocalTime.*;

public class dateTime {

    public static void main(String[] args) {

        ZonedDateTime timeDeparted = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2019, 11, 13),
                of(11, 15)), ZoneId.of("Australia/Sydney"));

        ZonedDateTime timeArrived = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2019,11,13),
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
}
