package javapracitce;

public class ThreadusingInterface implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Runnable interface Thread Started!");
		for(int i=100;i<400;i++)
		{
			System.out.println(i);
		}
	}

	

}
