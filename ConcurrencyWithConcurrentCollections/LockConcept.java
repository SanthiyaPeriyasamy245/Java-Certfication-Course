package ThreadsPractice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConcept {

 // lock provides thread safety.
	
	private int n=0;
	
	private int m=0;
	
	Lock lockforn=new ReentrantLock();
	Lock lockform=new ReentrantLock();
	public int getn()
	{
		return n;
	}
	 public void incn()
	{
		lockforn.lock();
		n++;
		lockforn.unlock();
	}
	
	
	public int getm()
	{
		return m;
	}
	 public void incm()
	{
		lockform.lock();
		m++;
		lockform.unlock();
	}
	
	
	

}
