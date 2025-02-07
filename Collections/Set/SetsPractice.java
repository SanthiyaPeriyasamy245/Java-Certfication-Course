package Sets;
import java.util.*;


public class SetsPractice {
	public static void main(String[]args) {
		
	Set<Integer>data=Set.of(23,87,78,99,1,13,90);
  
	Set<Integer>set1=new HashSet<Integer>(data);
	
	Set<Integer>set2=new LinkedHashSet<Integer>(data);
	
	TreeSet<Integer>set3=new TreeSet<Integer>(data);
	
	System.out.println(set1+"\n"+set2+"\n "+set3);
	
	List<Character>chars=List.of('A','Z','F','F','B','C','D','D','E');
	
	Set<Character>uniqueData=new LinkedHashSet(chars);
	
	System.out.println(uniqueData);
	
	
	System.out.println(set3.lower(23)); // it gives a number which is strictly lower than the given number.
	
	System.out.println(set3.floor(24)); // it gives a number which is strictly lower than the given number (inclusively>.
	
	System.out.println(set3.ceiling(23)); // it gives a number which is strictly higher than the given number.
	
	System.out.println(set3.higher(24));
	
	System.out.println(set3.subSet(0, 50)); // lower limit is inclusive upper limit is exclusive.
	
	System.out.println(set3.subSet(0,true, 50,true)); // true statements refers to take both upper and lower limit inclusively.
	
	System.out.println(set3.headSet(23,true)); // numbers upto 23
	
	System.out.println(set3.tailSet(23,false));// numbers above 23.true/false to ensure that the given number needs to  inclusive or exclusive.
	
	
	}
	
	
	
}
