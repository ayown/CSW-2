package JAVA1.src.Overloading;
import java.util.*;
public class StringManipulator {
    public static String reverse(String str){
        String rev="";
        for (int i=str.length()-1;i>=0;i--) {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static String reverse(String str,int s, int e){

        String newstr=str.substring(s,e);

        return reverse(newstr);
    }
    public static char[] reverse(char[] charArray){
        if(charArray == null){
            return null;
        }
        int i=0;int j=charArray.length-1;
        while(i<j){
            char temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
        return charArray;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=in.next();
        char[] ar=new char[s.length()];
        System.out.println("enter the starting and ending indices for reversal of string: ");
        int st=in.nextInt();
        int e=in.nextInt();
        System.out.println("write an array of characters: ");
        for(int i=0;i<ar.length-1;i++){
            ar[i]=in.next().charAt(0);
        }
        System.out.println("the full reversed string: "+reverse(s));
        System.out.println("the incomplete reversed string: "+reverse(s,st,e));
        ar=reverse(ar);
        System.out.println("the reversed character array: ");
        for(int j=0;j<ar.length;j++){
            System.out.print(ar[j]+" ");
        }
    }
}
