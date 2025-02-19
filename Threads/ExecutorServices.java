package javapracitce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServices {
	public static void main(String[]args)
	{
   ExecutorService e=Executors.newSingleThreadExecutor(); // only one thread executed at a time.
   
   e.execute(new ThreadusingInterface());
   
   e.execute(new ThreadsPractice());
   
   e.shutdown();
   
	}
}
	
