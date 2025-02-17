package ExceptionHandling;

public class ExceptionHandling {

	
	
	public static void main(String[]args)
	{
		method1();
		System.out.print("Main method ended!");
		
	}
	
	public static void method1() // this method handles exception.
	{
		try {
			String string =null;
			System.out.println(string.length() ); // it will throw null pointer exception
			
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		method2();
	}
	public static void method2() // this method handles exception.
	{
		try {
			int[]i= {1,2,3,4,5};
			
			System.out.println(i[5]); // it will throw null pointer exception
			
		}
		catch(NullPointerException e){
			e.printStackTrace();
			// so here we haven't told what to do when we found array indexout of bounds exception.
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception !");
			e.printStackTrace();
		}
		
		finally
		{
		    System.out.println("finally block!");	 // it will executed even though there is no  exception.
		}
	}
	
	
}
