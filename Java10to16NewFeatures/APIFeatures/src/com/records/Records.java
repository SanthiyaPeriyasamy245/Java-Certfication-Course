package com.records;

public class Records {
	
	
	
	record PersonData(String name,int age,String phoneNo) {// we can also write constructor here
		//PersonData(){this.name=name; etc..}
		// PersonData{write some exception are anything} this  is a compact constructor which is inside a record.
		// we can use static members static int n=5;
//	 you can write methods also
	}
	public static void main(String[]args)
	{
		PersonData p1=new PersonData("santhiya",20,"(+91)9342756047");
		
		PersonData p2=new PersonData("sandhiya",18,"(+91)9342556047");
		
		PersonData p3=new PersonData("Dhiya",10,"(+91)9342356047");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.name());
	
	}

}
