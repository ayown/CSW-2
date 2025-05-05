import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (yyyy-mm-dd): ");
        LocalDate start = LocalDate.parse(sc.nextLine());
        System.out.print("Enter end date (yyyy-mm-dd): ");
        LocalDate end = LocalDate.parse(sc.nextLine());

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between: " + daysBetween);
    }
}