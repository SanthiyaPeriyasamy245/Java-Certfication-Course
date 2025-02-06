package javapracitce;

import java.util.List;
import java.util.*;

public class Alist  {
public static void main(String[]args)
{
	List<Integer>numbers=List.of(101,12,3,49,5,60,17,81,9,110);
	List<Integer>numberscopy=new ArrayList<Integer>(numbers);
	Collections.sort(numberscopy);
	System.out.println(numberscopy);
	
   List<Student>arr=List.of(new Student(11),new Student(90),new Student(100),new Student(5));
   ArrayList<Student>arrcopy=new ArrayList<>(arr);
   Collections.sort(arrcopy);	
   System.out.println(arrcopy);
}


}
