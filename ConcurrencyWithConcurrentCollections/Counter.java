package ThreadsPractice;

public class Counter {
	
	private int n=0;
	
	
	public int getn()
	{
		return n;
	}
	synchronized public void incn()
	{
		n++;
	}
	synchronized public void decn()
	{
		n--;
	}
	

}
