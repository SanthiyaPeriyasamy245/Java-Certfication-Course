package StringApi;

public class Stringapi {
 public static void main(String[]args)
 {
	 
	 System.out.println("san".isBlank());
	 System.out.println("santhiya   ".strip());
	 System.out.println("santhiya ".stripLeading().replace(" ","@")); // it will remove space right side of a given string.
	 System.out.println("  Santhiya".stripTrailing().replace(" ","@")); // it will remove space before (left) side of a given string.
	 
	 String s="family\ncareer\npassion";
	
	 s.lines().forEach(System.out::println);
	 System.out.println(s.transform(e->e.substring(0,6)));
	 System.out.println("hi %s your age is %d".formatted("santhiya",20));
 }
}
