@FunctionalInterface
interface StringProcessor {
    int process(String str);
}

public class Q1 {
    public static void main(String[] args) {
        StringProcessor sp = s -> {
            return s.length();
        };
        System.out.println("Length of 'Hello': " + sp.process("Hello"));
    }
}