/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Pattern10
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=2*n;i++)
		{
		    int start=0;
		    if(i>n)
		    {
		        start=2*n-i;
		    }
		    else{
		     start=i;
		    }
		    for(int j=1;j<=start;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}