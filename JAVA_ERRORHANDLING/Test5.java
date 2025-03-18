package JAVA_ERRORHANDLING;

import java.util.*;

public class Test5 {

    public static int access(int[] ar, int i) {
        return ar[i];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] ar= {1,6,8,9,5};
        System.out.println("enter element to search: ");
        int x=in.nextInt();
        System.out.println("enter index to access");
        int id=in.nextInt();
        try{
            Arrays.sort(ar);
            access(ar,id);
            for (int i=0;i<ar.length;i++) {
                if(ar[i]==x){
                    System.out.println("element found ");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
