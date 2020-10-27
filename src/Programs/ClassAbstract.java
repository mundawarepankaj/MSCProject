package Programs;

abstract public class ClassAbstract
{
	int number; 
	
	
	ClassAbstract()
	{
		number = 200;
		
	}
	
	public void methodDisplay()
	{
		System.out.println("Hi ");
	}
	
	abstract public void abstractMethod();
	
	public static void main(String args[])
	{
		//ClassAbstract o = new ClassAbstract();
		BaseClass b = new BaseClass();
		
		
	}
}
