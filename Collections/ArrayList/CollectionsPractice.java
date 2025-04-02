package javapracitce;

import java.util.List;
import java.util.*;

public class  CollectionsPractice {
	public static void main(String[]args)
	{
	List<String>names=List.of("Ana","aniya","riya","ramya","tamizh"); // it's immutable
	List<Integer>numbers=List.of(1,2,3,4,5); // immutable
	System.out.println(names.get(1));
	
	System.out.println(names.indexOf("santhiya"));
	
	System.out.println(numbers);
	System.out.println(names);
	
	List<String>namescopy=new ArrayList<String>(names); // array list are mutable.
	namescopy.add("sountharya");
	namescopy.add("jane");
	System.out.println(namescopy);
	List<Integer>numberscopy1 =new LinkedList<Integer>(numbers); // linked list
	List<Integer>numberscopy2 =new Vector<Integer>(numbers); 
		numberscopy2.remove(2);
	
	// setting a an element at specific index or changing a value at specific index.
	numberscopy2.set(3,13);
	
//	adding an elements to the array list
	// 1. adding a single element.
	numberscopy1.add(10);
	
    // adding an element at specific index.
	numberscopy1.add(0,13);
	
	// adding an array list.
	numberscopy1.addAll(numberscopy2);

	
	System.out.print(numberscopy1 +" "+numberscopy2);
	Iterator iteration=namescopy.iterator();
	while(iteration.hasNext())
	{
		System.out.println(iteration.next());
	}
	
	Iterator iteration1=numberscopy1.iterator();
	while(iteration1.hasNext())
	{
		System.out.println(iteration1.next());
	}
	 
	List<String>animals=new ArrayList<String>();
	animals.add("elephant");
	animals.add("lion");
	animals.add("tiger");
	animals.add("dog");
	animals.add("cat");
	animals.add("rat");
	animals.add("donkey");
	animals.add("cow");
	
	
//	// concurrent modification exception. 
//	for(String animal :animals)
//	{
//		if(animal.startsWith("do"))
//		{
//			animals.remove(animal);
//		}
//	}
	
	Iterator iterationforanimal=animals.iterator();
	while(iterationforanimal.hasNext())
	{
		if(((String) iterationforanimal.next()).startsWith("do"))
		{
			iterationforanimal.remove();
		}
	}
	System.out.println(animals);

	

	}
	
	
	
	

}
