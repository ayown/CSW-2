import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (yyyy-mm-dd): ");
        LocalDate startDate = LocalDate.parse(sc.nextLine());
        System.out.print("Enter initial amount: ");
        double amount = sc.nextDouble();
        double rate = 0.08;

        long days = ChronoUnit.DAYS.between(startDate, LocalDate.now());
        double interest = (amount * rate * days) / 365;
        double total = amount + interest;

        System.out.println("Total amount with interest: " + total);
    }
}