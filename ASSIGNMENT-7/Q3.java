import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Lambda", "Expression", "API");
        list.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        list.forEach(System.out::println);
    }
}