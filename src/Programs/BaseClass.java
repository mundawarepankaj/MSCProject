package Programs;

public class BaseClass extends ClassSuper
{
	int number;
	
	public BaseClass()
	{
		
		super();
		
		number = 1000;
		
	}
	
	
	public void display()
	{
		//super.number = 20;
		//this.number = 200;
		System.out.println("Number of super class = "+super.number);
		System.out.println("Number of base class = "+this.number);
	}
	
	
	public static void main(String args[])
	{
		BaseClass obj = new BaseClass();
		obj.display();
		
	}

}
