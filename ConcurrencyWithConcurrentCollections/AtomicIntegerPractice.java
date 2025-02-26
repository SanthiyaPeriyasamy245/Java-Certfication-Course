package ThreadsPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerPractice {

	
	AtomicInteger n=new AtomicInteger();
	
	AtomicInteger m=new AtomicInteger();
	 // it provides thread safety 
	
	
	
	public int getn()
	{
		return n.get();
	}
	 public void incn()
	{
		n.incrementAndGet();
	}
	
	
	public int getm()
	{
		return m.get();
	}
	 public void incm()
	{
	m.incrementAndGet();
	}
	
	
	

}
