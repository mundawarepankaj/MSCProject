package Programs;

abstract public class AbstractFirst 
{
	int age;
	String name;
	
	AbstractFirst()
	{
	 age = 30;
	 name = "Raj";
	}
	
	abstract public void display();
	
	public void showClassDetails()
	{
		System.out.println("In astract class");
	}
	

}
