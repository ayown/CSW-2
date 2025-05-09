package CH19.ThreadClass;

class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running using Thread class");
    }
}

public class Test1 {
    public static void main(String[] args) {
        myThread th=new myThread();
        th.start();
        System.out.println("Main thread finished");
    }
}
