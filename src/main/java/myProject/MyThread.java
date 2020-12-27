package myProject;

public class MyThread extends Thread {

	public static int number; // not volatile
	public volatile static boolean ready;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Run()");
		while (!ready) {
			Thread.yield();
		}

		System.out.println(number);
	}
}
