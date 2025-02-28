package predicates.api;

import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	
	public static boolean iseven(int n)
	{
		return n%2==0;
	}
	
	public static void main(String[]args)
	{
		List<Integer>arr=List.of(1,2,3,4,5,6);
		Predicate<Integer>filteredlist=number->number%2==0;
		System.out.println("Even Numbers");
		arr.stream().filter(filteredlist).forEach(System.out::println);
		System.out.println("Odd Numbers");
		// negate() will check for not of the given condition
		arr.stream().filter(filteredlist.negate()).forEach(System.out::println);
		
		// here we are using external method to do opposite of it we are using predicate.not().
		System.out.println("Odd Numbers");
		arr.stream().filter(Predicate.not(Predicates::iseven)).forEach(System.out::println);
	
	}

}
