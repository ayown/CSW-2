package CH19.ThreadClass;

public class Test3 {
    public static void main(String[] args) {
        Thread highPriThread = new Thread(new EgRunnable(), "High Priority Thread");
        Thread normPriThread = new Thread(new EgRunnable(), "Normal Priority Thread");
        Thread lowPriThread = new Thread(new EgRunnable(), "Low Priority Thread");

        lowPriThread.start();
        normPriThread.start();
        highPriThread.start();
    }
    static class EgRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"is running with priority "+Thread.currentThread().getPriority());
            }
        }
    }
}