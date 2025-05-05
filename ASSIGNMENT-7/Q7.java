import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        LocalDate twoWeeksLater = LocalDate.now().plusWeeks(2);
        System.out.println("Date 2 weeks from now: " + twoWeeksLater);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Formatted Date: " + LocalDate.now().format(formatter));
    }
}