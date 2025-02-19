package javapracitce;

public class ThreadsPractice extends Thread {
	
public void run()
{
	System.out.println("Custom Thread Started!");
	for(int i=0;i<100;i++)
	{
		System.out.println(i);
	}
}
}
