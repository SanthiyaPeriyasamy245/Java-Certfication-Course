
package javapracitce;
import java.util.*;


public class Generics {
	
	
	public static void main(String[]args)
	{
		Customlist<Integer>ans=new Customlist<Integer>();
		
	
		Customlist<String>words=new Customlist<String>();
		ans.add(10);
		words.add("apple");
		words.add("banana");
		words.add("Orange");
		ans.add(20);
		ans.add(30);
		
		System.out.println(ans);
		System.out.println(words);
		System.out.println(ans.get(2));
		System.out.println(words.get(1));
		System.out.println(printanelement(Integer.valueOf(5)));
		System.out.println(sum(List.of(1,200l,3.8,4,5.0)));
		
		System.out.println(sumoftwoelements(4.6,7));
		
		
		ArrayList<Number>array=new ArrayList<>();
		add(array);
		System.out.println(array);
		
	}
	static double sumoftwoelements(Number n1,Number n2)
	{
		
		return n1.doubleValue()+n2.doubleValue();
		
	}
	static <X> X printanelement(X n1)
	{
		return n1;
	}
	
	// Upperbound wildcards.
	static double sum(List<? extends Number>arr) 

	{
		double sum=0;
		for(Number n:arr)
		{
			sum+=n.doubleValue();
		}
		return sum;
	}
	
	// Lowerbound  wildcard
		static void add(List<? super Number>arr) 

		{
			arr.add(1);
			arr.add(2.34);
			arr.add(9l);
			
		}
		
	
}
