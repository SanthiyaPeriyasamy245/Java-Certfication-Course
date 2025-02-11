package javapracitce;
import java.util.Comparator;

public class Descending implements Comparator<Employee>{

	 @Override
		public int compare(Employee o1, Employee old) {
		 System.out.println(o1.id);
		 System.out.println(old.id);
		 System.out.println("------------------");
			
			return old.id-o1.id;
	
			}
		
	
}