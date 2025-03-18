package JAVA_ERRORHANDLING;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        try{
            double val= Math.log(Math.sin(x)+Math.cos(x))/(Math.tan(x)-(1/Math.tan(x)));
            System.out.println(val);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
