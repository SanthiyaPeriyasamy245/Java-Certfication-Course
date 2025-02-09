package javapracitce;
import java.util.*;
public class Customlist<T> {
 
	ArrayList<T>arr=new ArrayList<T>();
	
	
	@Override
	public String toString() {
		return arr.toString();
	}
	public void  add(T n)
	{
	 arr.add(n);	
	}
	public T get(int  n)
	{
		return arr.get(n);
	}
	
	
	
}
