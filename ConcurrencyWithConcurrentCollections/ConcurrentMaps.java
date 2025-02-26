package ThreadsPractice;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMaps {
	public static void main(String[]args) {
	// Need f ConcurrentMap:
	// To enable multiple threads to safely read and write data from a map simultaneously without causing data inconsistencies
  
	ConcurrentMap<Character,LongAdder>occurence=new ConcurrentHashMap<>();
   
   String answer="ABC ABC ABC";
   
   // We are using LongAdder to make an automic increment if we use integer we needs to write i++. 
   
 for(char c:answer.toCharArray())
  {
//	   LongAdder longAdder=occurence.get(c);
//	   if(longAdder==null)
//	   {
//		longAdder=new LongAdder();   
//	   }
//	   longAdder.increment();   
//	   occurence.put(c, longAdder);
//   }
//   System.out.println(occurence);
   
  occurence.computeIfAbsent(c, ch->new LongAdder()).increment();
	}
 System.out.println(occurence);
	
}
}
