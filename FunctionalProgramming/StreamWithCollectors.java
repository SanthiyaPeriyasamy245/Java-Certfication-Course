package javapracitce;
import java.util.*;
import java.util.stream.Collectors;
public class Practicestreams{
		
		    public static void main(String[] args) {
		        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		        
		        List<Integer> evenNumbers = list.stream()
		                                        .filter(x -> x % 2 == 0)
		                                        .collect(Collectors.toList());  // Correct usage of Collectors
		        
		        System.out.println(evenNumbers);  // To print the result
		    }
		}


