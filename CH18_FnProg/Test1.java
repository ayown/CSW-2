package CH18_FnProg;
import java.util.*;
public class Test1 {
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4,5};
        int[] evenArray=Arrays.stream(arr)
                .filter(a -> a%2 ==0)
                .toArray();
        System.out.println(Arrays.toString(evenArray));

    }
}
