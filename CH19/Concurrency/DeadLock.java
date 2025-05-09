package CH19.Concurrency;

public class DeadLock {

	public static void main(String[] args) {
		final String firstResource="first resource";
		final String secondResource="second resource";
		Thread thread1=new Thread("First thread") {
			public void run() {
				synchronized (firstResource) {
					System.out.println(this.getName()+" : first resource is locked");
					try {
						Thread.sleep(100);
					} catch (Exception e) {}
					synchronized (secondResource) {
						System.out.println("waiting for second resource");
					}
				}
			}
		};
		Thread thread2=new Thread("second thread") {
			public void run() {
				synchronized (secondResource) {
					System.out.println(this.getName()+" : second resource is locked");
					try {
						Thread.sleep(100);
					} catch (Exception e) {}
					synchronized (firstResource) {
						System.out.println("waiting for first resource");
					}
				}
			}
		};	
		thread1.start();
		thread2.start();
	}		
}



