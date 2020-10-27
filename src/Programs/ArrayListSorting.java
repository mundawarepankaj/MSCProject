package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		List <Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(200);
		numbers.add(60);
		numbers.add(30);
		numbers.add(12);
		
		System.out.println("List before sorting:");
		
		
		System.out.println(numbers);
		
		//System.out.println("List After sorting/reverse Order:");
		Collections.sort(numbers);
		//Collections.reverseOrder();
		System.out.println(numbers);
		
		
		int minNumber  = Collections.min(numbers);
		int maxNumber = Collections.max(numbers);
		System.out.println("minNumber = "+minNumber);
		System.out.println("maxNumber = "+maxNumber);
		
	}

}
