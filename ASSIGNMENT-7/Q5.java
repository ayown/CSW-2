import java.util.function.Function;

public class Q5 {
    public static Function<Integer, Integer> getSquareFunction() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> square = getSquareFunction();
        System.out.println("Square of 5: " + square.apply(5));
        System.out.println("Square of 7: " + square.apply(7));
    }
}