package ThreadsPractice;
import java.util.Scanner;
public class Autoclosable {

	public static void main(String[]args)
	{
		
		// java 7 feature
		
		try(Scanner sc=new Scanner(System.in) ){ // interface cloasable extends autoclosable and it has close() method.
			
			int[]arr= {1,2,3,4,5};
			
			int n=arr[5];
		}
		
	}
}
