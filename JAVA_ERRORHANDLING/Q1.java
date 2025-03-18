package JAVA_ERRORHANDLING;

public class Q1 {
    public static void main(String[] args) {
        int x=100;
        int y;int s=0;
        System.out.println("number before reverse: "+x);
        while(x>0){
            y=x%10;
            s=(s*10)+y;
            x/=10;
        }
        System.out.println("number after reverse: "+s);
    }
}
