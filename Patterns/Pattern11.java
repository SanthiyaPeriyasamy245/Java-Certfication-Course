/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Pattern11
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=0;
		for(int i=1;i<=n;i++)
		{
		    start=i%2==0?1:0;
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(start);
		        start=1-start;
		        
		    }
		    System.out.println();
		    
	
		}
	}
}