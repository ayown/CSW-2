import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q8 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025, 5, 1, 14, 30, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted DateTime: " + dateTime.format(formatter));
    }
}