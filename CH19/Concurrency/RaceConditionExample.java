package CH19.Concurrency;

import java.util.concurrent.locks.ReentrantLock;
public class RaceConditionExample {
    private int c=0;
    private final ReentrantLock lock=new ReentrantLock();
    public void increment(){
        lock.lock();
        try{
            c++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        RaceConditionExample eg = new RaceConditionExample();
        Thread th1=new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                eg.increment();
            }
        });
    }
    
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }

}
