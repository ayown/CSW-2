import java.util.function.Function;

public class Q6 {
    public static Function<Integer, Integer> getFactorialFunction() {
        return n -> {
            int result = 1;
            for (int i = 2; i <= n; i++) result *= i;
            return result;
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = getFactorialFunction();
        System.out.println("Factorial of 5: " + factorial.apply(5));
    }
}