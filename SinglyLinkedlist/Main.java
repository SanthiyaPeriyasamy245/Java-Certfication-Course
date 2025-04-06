
public class Main {

	public static void main(String[]args) {
		
	Ll linkedlist=new Ll();
	linkedlist.addfirst(3);
	linkedlist.addfirst(13);
	linkedlist.addfirst(32);
	linkedlist.addfirst(34);
	linkedlist.addlast(11);
	linkedlist.addlast(22);
	linkedlist.display();
	
	System.out.println();
	
	linkedlist.insert(550, 0);
	linkedlist.insert(15, 2);
	linkedlist.insert(55,6);
	linkedlist.insert(17,3);
	linkedlist.display();
	System.out.println();
	
	System.out.println(linkedlist.size());
	
	System.out.println();
	
	linkedlist.deletefirst();
	linkedlist.display();
	linkedlist.deletelast();
	System.out.println();
	
	linkedlist.display();
	
	linkedlist.delete(4);
	
	System.out.println();
	
	linkedlist.display();
	
	}
}
