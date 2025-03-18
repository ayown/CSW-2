package JAVA_ERRORHANDLING;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x = sc.next();
        String y= sc.next();

        try {
            int a=Integer.parseInt(x);
            int b=Integer.parseInt(y);
            int div=a/b;
            System.out.println(div);
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
