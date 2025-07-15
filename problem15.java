/* This program shows the current date and time */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class problem15 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        String cd = today.format(formatter);
        System.out.println("Current date and time is: " + cd);
    }
}
