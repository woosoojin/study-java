package sec01.exam06;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("The name of the main thread: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("The name of the worker thread: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("The name of the worker thread: " + threadB.getName());
		threadB.start();
	}
}
