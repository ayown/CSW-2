package CH18_FnProg.LAMBDAS;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> st1= Arrays.asList(50,60,70,80,90);
        System.out.println("Marks for student1 : ");
        st1.forEach(System.out::println); //st1.forEach(m -> sout(m));
        List<Integer> st2= Arrays.asList(90,80,70,60,50);
        System.out.println("Marks for student2 : ");
        st2.forEach(System.out::println); //method reference from the object as it takes one ref at a time from st2
        // which has Arraylist inside it and prints it
    }
}
