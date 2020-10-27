package Programs;

public class ExtendedClass extends NormalClass
{

	public void method1()
	{
		System.out.println("Sub class method");
		
	}
	
	public static void main(String[] args) 
	{
		NormalClass o = new NormalClass();
		int a =o.age;
		o.getMethod();
		
		
		NormalClass p = new ExtendedClass();
		int j =p.age;
		p.getMethod();
		
		ExtendedClass ob = new ExtendedClass();
		int l = ob.age;
		ob.getMethod();
		ob.method1();
		
		
		
		

	}

}
