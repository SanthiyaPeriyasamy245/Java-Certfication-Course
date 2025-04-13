
import java.util.*;
public class Pattern9
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/*
		
	    *
	   ***
	  ***** 
	 *******
	*********
       printing reverse of this pattern
		*/
		
		int n=sc.nextInt();
		int c=n;
	    for(int i=n;i>0;i--)
	    {
	     
	      for(int k=n;k>i;k--)
	      {
	          System.out.print(" ");
	      }
	      for(int j=1;j<=i*2-1;j++)
	      {
	          System.out.print("*");
	      }
	        
	        for(int k=n;k<i;k--)
	      {
	          System.out.print(" ");
	      }
	      System.out.println();
	    }
	    
	
	}
}
