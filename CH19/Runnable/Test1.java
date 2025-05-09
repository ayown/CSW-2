package CH19.Runnable;

class myRun implements Runnable{
    public void run(){
        System.out.println("Thread is running using Runnable interface");
    }
}
public class Test1{
    public static void main(String[] args) {
        myRun mr=new myRun();
        Thread thread = new Thread(mr);
        thread.start();
        System.out.println("Main Thread finished");
    }
}