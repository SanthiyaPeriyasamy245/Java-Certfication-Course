package com.LocalVariableTypeInterfrence;

import java.util.List;

public class LocalVariableTypeInterfrence {

	public static void main(String[]args)
	{
		List<Integer>nums1=List.of(1,2,3,4,5);
		List<Integer>nums2=List.of(1,2,3,4,5);
		List<List<Integer>>arr1=List.of(nums1,nums2);
		// we can use var as typr of reference variable instead of mentioning actual type.
		var arr2=List.of(nums1,nums2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		// we can also use final keyword.
		final var num=5;
		System.out.println(num);
		
		// we can't assign null value to the variable which has reference type of var 
		// var s=null;
		int n=5;
		String day=switch(n)
				{
				case 0->{
					// if we need to write some logic here we can use {}.
					yield "Sunday";
				}
				case 1->"Monday";
				case 2->"Tuesday";
				case 3->"Wednesday";
				case 4->"Thursday";
				case 5->"Friday";
				case 6->"saturday";
				default-> throw new IllegalArgumentException("Invalid");
			
				};
		
				//"""  between these we can format as we want by line strings that needs to be executed"""
				String str="""
						Sivakumar:%d
						Gowtham:%d
						Santhiya :%d  
						""".formatted(27,26,20);
				System.out.println(str);
				
		System.out.println(day);
		
	
	
}
}
