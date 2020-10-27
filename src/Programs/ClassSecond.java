package Programs;

public class ClassSecond extends AbstractFirst
{

	@Override
	public void display() 
	{
	System.out.println("This is abstract method of parent class");
		
	}
	
	public void ShowDetails()
	{
		System.out.println("This is sub class");
	}
	public static void main(String[] args) 
	{
		ClassSecond o = new ClassSecond();
		o.ShowDetails();
		o.display();
		o.showClassDetails();

		AbstractFirst p = new ClassSecond();
		
		

	}

	
	
	
	

}
