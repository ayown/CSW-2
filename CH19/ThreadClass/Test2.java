package CH19.ThreadClass;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+" started with priority: "+ getPriority());
        for (int i = 1; i < 3 ; i++) {
            System.out.println(getName()+" -> Count: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName()+" was interrupted ");
            }
        }
        System.out.println(getName()+" was finished ");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyThread th1=new MyThread();
        th1.setName("Thread-1");
        th1.setPriority(Thread.MIN_PRIORITY);
        MyThread th2 =new MyThread();
        th2.setName("Thread-2");
        th2.setPriority(Thread.NORM_PRIORITY);
        MyThread th3 =new MyThread();
        th3.setName("Thread-3");
        th3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main Thread starting both threads...");
        th1.start();
        th2.start();
        th3.start();
        System.out.println("Is Thread-1 alive?" + th1.isAlive());
        System.out.println("Is Thread-2 alive?" + th2.isAlive());
        System.out.println("Is Thread-3 alive?" + th3.isAlive());
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Is Thread-1 alive?" +th1.isAlive());
        System.out.println("Is Thread-2 alive?" +th2.isAlive());
        System.out.println("Is Thread-3 alive?" +th3.isAlive());
        System.out.println("Main thread ends after both threads complete");
    }
}
