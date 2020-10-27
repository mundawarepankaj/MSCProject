package Programs;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number");
		number = in.nextInt();
		
		if(number == 1)
			System.out.println("Smallest prime number is 2");
		
		int i;
		
		for(i = 2; i<number; i++)
		{
			if(number%i==0)
			{
				System.out.println("Not a prime number");
				break;
			}
		}
		
		if(number == i )
		{
			System.out.println("number is prime");
		}
	}

}
