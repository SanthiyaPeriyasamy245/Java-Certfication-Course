
public class Ll {

	 Node head;
	 Node tail;
	 int size;
	private class Node{
		int val;
		Node next;
		private Node(int val) {
			this.val = val;
		}
		private Node(int val,Node next) {
			this.val = val;
			this.next=next;
		}
		
		
	}
	public Ll()
	{
		this.size=0;
		
	}
	public void addfirst(int val)
	{
		Node node=new Node(val);
		if(head==null)
		{
			head=node;
		}
		if(tail==null)
		{
			tail=node;
		}
		node.next=head;
		head=node;
		size+=1;
	}
	public void addlast(int val)
	{
		Node node=new Node(val);
		if(tail==null)
		{
			addfirst(val);
		}
		tail.next=node;
		tail=node;
		size+=1;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val + " ");
			System.out.print("->");
			temp=temp.next;
		}
		System.out.print("end");
	}
	public void insert(int val,int index)
	{
		Node node=new Node(val);
		if(index==0)
		{
		   addfirst(val);
		   return;
		}
		if(index==size)
		{
			addlast(val);
			return;
		}
		
		Node temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		
		size+=1;
		
	}
	public int size()
	{
		return size;
	}
	
	public void deletefirst()
	{
		// head=head.next;
		  int val = head.val;
	        head = head.next;
	        if (head == null) {
	            tail = null;
	        }
	        size--;
	        
		
	}
	public void deletelast()
	{
		Node temp=head;
		if(tail==null)
		{
			System.out.println("Nothing to delete");
			return;
		}
		for(int i=0;i<size-2;i++)
		{
			temp=temp.next;
		}
		temp.next=null;
		size-=1;
	}
	public void delete(int index)
	{
		if(index==0)
		{
			deletefirst();
			return;
		}
		if(index==size-1)
		{
			deletelast();
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
}
