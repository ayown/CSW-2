package CH19.Concurrency;

public class RaceCondition {
    private int counter=0;
    public void increment() {
        counter++;
    }

    public static void main(String[] args) {
        RaceCondition example=new RaceCondition();
        Thread thread1=new Thread(() -> {
            for (int i=0;i<1000;i++) {
                example.increment();
            } });
        Thread thread2=new Thread(() -> {
            for(int i=0;i<1000;i++) {
                example.increment();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final counter value: "+example.counter);

    }

}

