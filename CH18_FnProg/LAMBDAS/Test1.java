package CH18_FnProg.LAMBDAS;

public class Test1 {
    interface printText{
        String print();
    }

    public static void main(String[] args) {
        System.out.println();
        printText pt = () -> "hi this is lambda expression" ;
        System.out.println(pt.print());
    }
}

