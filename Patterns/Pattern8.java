
import java.util.*;
public class Pattern8
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
	    for(int i=1;i<=n;i++)
	    {
	     for(int j=i;j<n;j++)
	      {
	          System.out.print(" ");
	      }
	      
	      for(int j=1;j<=2*i-1;j++)
	      {
	          System.out.print("*");
	      }
	      for(int j=i;j<n;j++)
	      {
	          System.out.print(" ");
	      }
	      c-=1;
	      System.out.println();
	        
	    }
	    
	
	}
}
