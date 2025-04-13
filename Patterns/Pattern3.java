
import java.util.*;
public class Pattern3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/*
		
		1
		12
		123
		1234
		12345
		
		*/
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
