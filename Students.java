
import java.util.*;


 class Student{
    private String name;
    private ArrayList<Integer>marks=new ArrayList<>();
    
    public Student(String name,int...arr)
    {
        this.name=name;
        for(int x:arr)
        {
            marks.add(x);
        }
    }
    public int minimum()
    {
        return Collections.min(marks);
    }
    public String toString()
    {
        return name+marks;
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Integer> getMarks()
    {
        return marks;
    }
    public int maximum()
    {
        return Collections.max(marks);
    }
   public void addmarks(int x)
   {
       marks.add(x);
   }
   public void delete(int x)
   {
       marks.remove(marks.indexOf(x));
   }
   
   
}
public class Students
{
	public static void main(String[] args) {
		
		Student s1=new Student("Santhiya",96,88,79,90);
		Student s2=new Student("Deepika",95,98,89);
		Student s3=new Student("Sarathi",86,98,99,99);
		System.out.println(s1.minimum());
		System.out.println(s1.maximum());
		System.out.println(s1);
		System.out.println(s2);
		s2.addmarks(100);
		System.out.println(s3);
		System.out.println(s2);
		s1.delete(88);
		System.out.println(s1);
		
	}
}
