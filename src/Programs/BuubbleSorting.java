package Programs;

public class BuubbleSorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int number[] = {20, 10, 45, 200, 100};
		
		for(int i =0; i<number.length; i++)
		{
			System.out.println(number[i]);
		}

		
		System.out.println("\n");
		

		for(int i = 0; i<number.length; i++)
		{
			System.out.println(number[i]);
		}
		
		
		//String str = "Pankaj";
		String str = new String("Pankaj");
		System.out.println(str.length());
		System.out.println(str.indexOf('P'));
		for(int i =0; i<str.length(); i++)
		{
			
			System.out.println("Index of "+str.charAt(i)+" = "+str.indexOf(str.charAt(i)));
		}
		
	}
}
