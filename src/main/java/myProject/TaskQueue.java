package myProject;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
	Queue<String> queue = new LinkedList<>();
	
	ThreadLocal<String> mStringThreadLocal = new ThreadLocal<>();
	
    public synchronized void addTask(String s) {
        this.queue.add(s);
        System.out.println(mStringThreadLocal.get());
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
    	mStringThreadLocal.set("droidyue.com");
        while (queue.isEmpty()) {
        	 this.wait();
        }
        return queue.remove();
    }
}
