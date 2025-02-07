package javapracitce;
import java.util.*;
public class Maps {
public static void main(String[]args)
{
	Map<Integer,Integer>numbers=new HashMap<>(Map.of(1,2,3,4,5,6));
	Map<Integer,Integer>numbers1=new LinkedHashMap<>(Map.of(1,2,3,4,5,6));
	TreeMap<Integer,Integer>numbers2=new TreeMap<>(Map.of(11,0,3,4,5,6));
	System.out.println(numbers);
	System.out.println(numbers1);
	System.out.println(numbers2);
	System.out.println(numbers2.higherKey(3));
	
	System.out.println(numbers2.lowerKey(3));
	
	System.out.println(numbers2.floorKey(4));
	
	System.out.println(numbers2.ceilingKey(3));
	
	System.out.println(numbers2.firstEntry());
	
	System.out.println(numbers2.lastEntry());
	
	System.out.println(numbers2.subMap(3,5));
	
	String word="this is great word and this is an excercise question";
	Map<Character,Integer>freqchar=new HashMap<>();
	Map<String,Integer>freqword=new HashMap<>();
	for(char c:word.toCharArray())
	{
		freqchar.put(c,freqchar.getOrDefault(c,0)+1);
	}
	System.out.print(freqchar);
	for(String s:word.split("\\s"))
	{
		freqword.put(s, freqword.getOrDefault(s,0)+1);
	}
	System.out.print(freqword);
	
}
}
