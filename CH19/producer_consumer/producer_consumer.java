package CH19.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;
class SharedBuffer{
    private Queue<Integer> buffer=new LinkedList<>();
    private final int MAX_CAPACITY=5;
    public synchronized void produce(int item) throws InterruptedException{
        while(buffer.size()==MAX_CAPACITY) {
            wait();
        }
        buffer.add(item);
        System.out.println("produced: "+item);
        notify();
    }
    public synchronized int consume() throws InterruptedException{
        while(buffer.isEmpty()) {
            wait();
        }
        int item=buffer.poll();
        System.out.println("consumed: "+item);
        notify();
        return item;
    }

}
class Producer implements Runnable{
    private SharedBuffer sharedBuffer;
    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer=sharedBuffer;
    }
    public void run() {
        try {
            for(int i=0;i<10;i++) {
                sharedBuffer.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public Consumer implements Runnable{
    private SharedBuffer sharedBuffer;
	public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer=sharedBuffer;

    }
    public void run() {
        try {for(int i=0;i<10;i++) {
            sharedBuffer.consume(i);
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class producer_consumer {

    public static void main(String[] args) {
        SharedBuffer sharedBuffer=new SharedBuffer();
        Thread producerThread=new Thread(new Producer(sharedBuffer));
        Thread consumerThread=new Thread(new Consumer(sharedBuffer));
        producerThread.start();
        try {
            Thread.sleep(100);
        }

    }

}

