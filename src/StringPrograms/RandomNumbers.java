package StringPrograms;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Random numbers = new Random();
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Numbers "+numbers.nextInt(10));
		}
		
		
		
		
		
	}

}
