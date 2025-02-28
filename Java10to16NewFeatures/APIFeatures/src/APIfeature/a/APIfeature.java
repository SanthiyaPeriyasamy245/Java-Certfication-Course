package APIfeature.a;

import java.util.List;

public class APIfeature {

	public static void main(String[] args) {
		
		List<Integer>list=List.of(1,2,3,4,5); // it allows you to create immutable list
		System.out.println(list);
		
		
      // to create immutable list of existing list we can use copyOf similarly applicable for map.
		List<Integer>copyOfList=List.copyOf(list);
		// copyOfList.add(7); it will throw an error.
		System.out.println(copyOfList);
	}

}
