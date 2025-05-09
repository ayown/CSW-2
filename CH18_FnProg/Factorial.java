package CH18_FnProg;
import java.util.*;
public class Factorial {
    public static int rec(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * rec(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+rec(num));
    }
}

