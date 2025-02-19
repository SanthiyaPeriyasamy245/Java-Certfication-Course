package javapracitce;

public class Main {
public static void main(String[]args) throws InterruptedException  {
	
	
	ThreadsPractice test=new ThreadsPractice();
	
	ThreadusingInterface test2=new ThreadusingInterface();
	
	Thread forrunnableinterface=new Thread(test2);
	
	forrunnableinterface.start();
	
	forrunnableinterface.setPriority(10);	
	
	// runnable interface only has run method so to call start method 
	//to initialize thread we need to create an thread class object
	
	// start is used to run the code if we use run it work as like methods.
	
	test.start();
    test.join(); // after the test get completed then only next thread will be run.
	
	 /* Main thread started executing first and parllely the Threadpractices thread also run*/
	
	System.out.println("Main Thread Started!");
	
	for(int i=101;i<200;i++)
	{
		System.out.println(i);
	}
	
}

}
