package myProject;

import java.util.concurrent.Semaphore;

public class TaskThread extends Thread {

    Semaphore semaphore;

    public TaskThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(getName() + " acquire");
            Thread.sleep(1000);
            semaphore.release();
            System.out.println(getName() + " release ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
