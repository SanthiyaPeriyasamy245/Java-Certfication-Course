
import java.util.*;
public class Pattern6
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/*
		
		*
	   ***
	  ***** 
	 *******
	*********
		*/
		
		int n=sc.nextInt();
		int c=n;
	    for(int i=2;i<=n*2;i+=2)
	    {
	     for(int j=1;j<c;j++)
	      {
	          System.out.print(" ");
	      }
	      
	      for(int j=1;j<=i-1;j++)
	      {
	          System.out.print("*");
	      }
	      for(int j=1;j<c;j++)
	      {
	          System.out.print(" ");
	      }
	      c-=1;
	      System.out.println();
	        
	    }
	    
	
	}
}
