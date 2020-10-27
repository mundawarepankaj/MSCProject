package Programs;

public class ExtendingAbstract extends ClassAbstract 
{

	public void abstractMethod() 
	{
	System.out.println("This is abstract method");
		
	}
	public void disp()
	{
		System.out.println("this is disp method of base class");
	}
	public static void main(String[] args) 
	{
		
		ExtendingAbstract obj = new ExtendingAbstract();
		obj.abstractMethod();
		obj.disp();
		obj.methodDisplay();
	}

}
