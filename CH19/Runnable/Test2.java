package CH19.Runnable;

class MyRun implements Runnable{
    private String tName;
    public MyRun(String name){
        this.tName=name;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(tName+ " -> Count: "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(tName+"was interrupted");
            }
        }
        System.out.println(tName+ " finished");
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyRun mr1=new MyRun("Thread-1");
        MyRun mr2 =new MyRun("Thread-2");
        Thread th1=new Thread(mr1);
        Thread th2=new Thread(mr2);
        th1.start();
        th2.start();
        System.out.println("Main thread started both threads");
    }
}
