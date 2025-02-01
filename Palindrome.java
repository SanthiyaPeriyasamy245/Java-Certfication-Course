/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
		int total=sum(1,2,3,4,5,6,7,8);
		boolean[]Names=check("Amma","Appa","Anna","thangachi","akka","thambi","anni");
		System.out.println(total);
		System.out.print(Arrays.toString(Names));
	}
public static boolean[] check(String...s)
{
    boolean[]arr=new boolean[s.length];
   
    for(int i=0;i<s.length;i++)
    {
        
            arr[i]=palindromechecker(s[i]);
    
    }
    return arr;
}
public static boolean palindromechecker(String y)
{
    y=y.toLowerCase();
    StringBuilder sb=new StringBuilder(y);
    return sb.reverse().toString().equals(y);
}
public static int sum(int...v)
{
 int t=0;
    for(int x:v)
    {
    t=t+x;
    }
return t;
}
}