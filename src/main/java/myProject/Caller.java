package myProject;

import java.util.concurrent.Callable;

import org.w3c.dom.css.Counter;

public class Caller implements Callable<String> {
	private static int counter;
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		counter++;
		return Integer.toString(counter);
	}

}
