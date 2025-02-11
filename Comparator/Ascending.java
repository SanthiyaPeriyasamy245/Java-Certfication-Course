package javapracitce;

import java.util.Comparator;

public class Ascending implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		System.out.println(o1.name);
		System.out.println(o2.name);
		System.out.println("---------------------------");
		
		return o1.name.compareTo(o2.name);
	}

	 

	

}
