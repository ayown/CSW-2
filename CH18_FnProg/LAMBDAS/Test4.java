package CH18_FnProg.LAMBDAS;

public class Test4 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Thread is running using anonymous class");
        new Thread(task).start();
    }

}
