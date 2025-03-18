package JAVA_ERRORHANDLING;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ar= new int[5];
        System.out.println("enter values: ");
        try{
            for (int i=0;i<=10;i++) {
                ar[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
