package Programs;

public class ClassExtendedAbstractClass extends ClassAbstractClass
{

	public void ClassMethod()
	{
		System.out.println("This is parent class method");
	}
	
	public void showDetails()
	{
		System.out.println("This is implemented method of abstract class");
	}

	
	public static void main(String[] args) 
	{
		ClassExtendedAbstractClass  o = new ClassExtendedAbstractClass();
		int a = o.age;
		
		o.ClassMethod();
		o.showDetails();
		
		
		ClassAbstractClass ref = new ClassExtendedAbstractClass();
		int age_ = ref.age;
		ref.showDetails();
		
		
	
	
	}

}
