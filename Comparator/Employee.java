package javapracitce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Employee{
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return this.id+" "+this.name;
	}
	public static void main(String[]args)
	{
		Employee emp1=new Employee(11,"san");
		Employee emp2=new Employee(20,"sandy");
		Employee emp3=new Employee(3,"sagudhala");
		Employee emp4=new Employee(93,"sandhya");
		Employee emp5=new Employee(1,"sri");
		Employee emp6=new Employee(81,"madhu");
		Employee emp7=new Employee(1,"sherin");
		Employee emp8=new Employee(61,"shami");
		Employee emp9=new Employee(19,"saras");
		List<Employee>emp=new ArrayList<Employee>();
		emp.add(emp9);
		emp.add(emp8);
		emp.add(emp7);
		emp.add(emp6);
		emp.add(emp5);
		emp.add(emp4);
		emp.add(emp3);
		emp.add(emp2);
		emp.add(emp1);
		Collections.sort(emp,new Descending());
		System.out.println(emp);
		Collections.sort(emp,new Ascending());
		System.out.println(emp);
		
		
		
	}
	

}
