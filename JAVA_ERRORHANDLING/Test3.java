package JAVA_ERRORHANDLING;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x= in.nextInt();
        try{
            double val= Math.sqrt(Math.sin(x)*Math.cos(x))/(Math.tan(x)+1);
            System.out.println(val);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
