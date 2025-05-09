package CH18_FnProg.LAMBDAS;

interface calculate{
   double calculation(int a,int b);
}

public class Test5 {
    public static void main(String[] args) {
        calculate add = (a,b) -> a+b;
        calculate sub= (a,b) -> a-b;
        calculate mul= (a,b) -> a*b;
        calculate div= (a,b) -> a/b;
        System.out.println(add.calculation(5,10));
        System.out.println(sub.calculation(15,10));
        System.out.println(mul.calculation(5,10));
        System.out.println(div.calculation(10,10));
    }
}
