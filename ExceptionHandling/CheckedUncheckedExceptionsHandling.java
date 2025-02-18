package ThreadsPractice;


class Amount{
	int amount;
	String currency;
	public Amount(String name,int number)
	{
		this.amount=number;
		this.currency=name;
	}
	public  void  add(Amount that) // here we indicate that this method going to throw an checked exception
	{
		// here we are adding both dollar and pound without converting pound to dollars.so there is an exception we need handle.
	
	/*	if(!this.currency.equals(that.currency))
		{
			throw new RuntimeException("Currencies are not same!");
		}  this for unchecked exception
		
		*/
		
//		if(!this.currency.equals(that.currency))
//		{
//			throw new Exception("Currencies are not same!"); it's general exception handling
//		}

		if(!this.currency.equals(that.currency))
		{
			throw new CustomException("Currencies are not same!");
		}
		this.amount+=that.amount;
	}
	public String toString()
	{
		return this.currency +" "+this.amount;
	}
	
}
public class CheckedUncheckedExceptionsHandling {
	public static void main(String[]args) 
	{
		Amount amount1=new Amount("dolar",12);
		
		Amount amount2= new Amount("Pound",50);
		
		amount1.add(amount2);
		
		System.out.println(amount1);	
		
		
	}

}
class CustomException extends RuntimeException{
	public CustomException(String name)
	{
		super(name);
	}
}
