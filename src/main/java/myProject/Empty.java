package myProject;

public class Empty implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " in Empty is running");
	}

}
