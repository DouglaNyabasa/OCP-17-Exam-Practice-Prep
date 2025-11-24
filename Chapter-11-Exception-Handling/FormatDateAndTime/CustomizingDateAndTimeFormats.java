

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomizingDateAndTimeFormats {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        var f = DateTimeFormatter.ofPattern("MMMM dd,yyyy 'at' hh:mm ");
        System.out.println(f.format(dateTime));
	        System.out.println("===============================");
        LocalDateTime dateTime2 = LocalDateTime.of(date,time);
        var f1 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm:ss");
        System.out.println(f1.format(dateTime2));
        System.out.println("===============================");
        LocalDateTime dateTime3 = LocalDateTime.of(date,time);
        var f2 = DateTimeFormatter.ofPattern("MM_dd_yy 'at' hh:mm ");
        System.out.println(f2.format(dateTime3));
    }
}

