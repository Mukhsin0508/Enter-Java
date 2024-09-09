import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class StopWatch {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        LocalDateTime endTime = LocalDateTime.now();
        System.out.println(endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

}
