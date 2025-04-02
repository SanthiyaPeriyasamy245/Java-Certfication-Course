
package javapracitce;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable<String> {

	
	private String name;
	public CallableInterface(String name)
	{
		this.name=name;
	}
	@Override
	public String call() throws Exception {
	
		return name +" callable execution";
		  // Code to be executed in a separate thread
	}
	public static void main(String[]args) throws InterruptedException, ExecutionException
	{
		ExecutorService e=Executors.newSingleThreadExecutor();
		
		Future<String>answer=e.submit(new CallableInterface("Santhiya"));
		String ans=answer.get();
		System.out.println(ans);
	}
	
	

}
