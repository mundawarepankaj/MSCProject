package Programs;

public class NewClass {

	public static void main(String[] args)
	{
		String name = "Pankaj";
		
		ClassAbstract ref = new ClassAbstract() {
			
			@Override
			public void abstractMethod() {
				
				System.out.println("THis is it");
			}
		};

		ref.abstractMethod();
		
	}

}
