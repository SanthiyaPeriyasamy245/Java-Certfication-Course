/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

 class Student{
    private String name;
    private int[]marks;
    
    public Student(String name,int...arr)
    {
        this.name=name;
        this.marks=arr;
    }
    public String getName()
    {
        return name;
    }
    public int[] getMarks()
    {
        return marks;
    }
    public double avg()
    {
        int sum=0;
        for(int x:marks)
        {
            sum=sum+x;
        }
        return sum/marks.length;
    }
    public  String pass()
    {
        for(int x:marks)
        {
            if(x<50)
            {
                return "Need to learn!";
            }
        }
        return "Learn more and grow more!";
    }
}
public class Introduction
{
	public static void main(String[] args) {
		
		Student s1=new Student("Santhiya",96,88,79,90);
		Student s2=new Student("Deepika",95,98,89);
		Student s3=new Student("Sarathi",86,98,99,99);
		System.out.println(Arrays.toString(s1.getMarks()));
		System.out.println(s1.getName());
		System.out.println(Arrays.toString(s2.getMarks()));
		System.out.println(s2.getName());
		System.out.println(Arrays.toString(s3.getMarks()));
		System.out.println(s3.getName());
		System.out.println(s1.avg());
		System.out.println(s2.avg());
		System.out.println(s3.avg());
		System.out.println(s1.pass());
		System.out.println(s2.pass());
		System.out.println(s3.pass());
		
	}
}