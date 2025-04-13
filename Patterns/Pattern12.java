/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Pattern12
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	 
	 
	 /*
	     
	     1      1
	     12    21
	     123  321
	     12344321
	 
	 */
		for(int i=1;i<=n;i++)
		{
		   
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		        
		        
		    }
		    for(int k=1;k<=2*(n-i);k++)
		    {
		        System.out.print(" ");
		    }
		     for(int j=i;j>0;j--)
		    {
		        System.out.print(j);
		        
		        
		    }
		    System.out.println();
		    
	
		}
	}
}