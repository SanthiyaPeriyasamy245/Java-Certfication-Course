package ThreadsPractice;
import java.util.Scanner;
public class Autoclosable {

	public static void main(String[]args)
	{
	/* The main difference between AutoCloseable and try-catch-finally in Java lies in resource management.
		AutoCloseable is an interface that, when implemented, allows resources to be automatically closed at the end of a try-with-resources block,
		while try-catch-finally is the traditional exception handling mechanism where a finally block is used to ensure resources are closed manuall
		*/
		// java 7 feature
		
		try(Scanner sc=new Scanner(System.in) ){ // interface cloasable extends autoclosable and it has close() method.
			
			int[]arr= {1,2,3,4,5};
			
			int n=arr[5];
		}
		
	}
}
