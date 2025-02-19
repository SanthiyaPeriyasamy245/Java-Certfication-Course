package javapracitce;

public class MultiThreadExecution extends Thread {
	
	private int n;
	public MultiThreadExecution(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for(int i=n;i<n*10;i++)
		{
			System.out.println(i*10);
		}
	}

}
