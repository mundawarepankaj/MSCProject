package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayOperations {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int number[] = new int[] {10, 20, 5, 45, 90};
		
		System.out.println("Original Array Items");
		for(int i =0; i<number.length; i++)
		{
			System.out.println(number[i]);
		
		}
		System.out.println();
		System.out.println("Reverse Array Items");
		for(int i = number.length-1; i>=0; i--)
		{
			System.out.println(number[i]);
		}
		
		System.out.println("----------------------------------------------------------");
		
		int sum = 0;
		System.out.println("Addition of Array items");
		
		for(int i = 0; i<number.length; i++)
		{
			sum = sum + number[i];
		}
		
		
		System.out.println("Total Sum of Array items--> "+sum);
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Biggest Array item");
		
		int biggest = number[0];
		
		for(int i = 0; i<number.length; i++)
		{
			if(number[i]>biggest)
			{
				biggest = number[i];
				
			}
		}
		
		System.out.println("Biggest array item is --> "+biggest);
		
		System.out.println("----------------------------------------------------------");
		
		int smallest = number[0];
		
		for(int i = 0; i<number.length; i++)
		{
			if(number[i]<smallest)
			{
				smallest = number[i];
				
			}
		}
		
		System.out.println("smallest array item is --> "+smallest);
		
		System.out.println("----------------------------------------------------------");

		System.out.println("Sorting of array items");
		
		for(int i = 0; i<number.length-1; i++)
		{
			for(int j = i+1; j<number.length; j++)
			{
				if(number[i]>number[j])
				{
					int temp = number[i];
					number[i] = number[j];
					number[j]= temp;
				}
			}
		}
		
		System.out.println("Sorted array items are: ");
		for(int i = 0; i<number.length; i++)
		{
			System.out.println(number[i]);
		}
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Find out the Second Highest element of array");
	
		int nums[] = new int[] {65, 85, 12, 58, 10};
		
		System.out.println("Array items to sort");
		for(int i =0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
			
		}
		
		System.out.println();
		
		for(int i =0; i<nums.length-1; i++)
		{
			for(int j = i+1; j<nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("After sorting Array items");
		for(int i =0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
			
		}
		System.out.println();
		
		
		System.out.println("Second highest number is = "+nums[3]);
		
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Sorting of array by Collection.reverse() method");
				 
		Integer num3[] = new Integer[] {65, 20, 54, 78, 100};
		
		System.out.println("Before sorting array items");
		
		for(int i = 0; i<num3.length; i++)
		{
			System.out.println(num3[i]);
		}
		System.out.println();		
		System.out.println("After sorting");
		
		Collections.reverse(Arrays.asList(num3));
		
		for(int i = 0; i<num3.length; i++)
		{
			System.out.println(num3[i]);
		}
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Convert Integer Array to List");
		
		Integer numberArray[] = new Integer[] {10, 54, 5, 12};
		
		List <Integer> sortedList = Arrays.asList(numberArray);
		
		
		
		Iterator it = sortedList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
					
		
		Integer numList[] = new Integer[] {52,10, 69, 100};
		
		System.out.println("Before sort");
		for(Integer each:numList)
		{
			System.out.println(each);
		}
		Arrays.sort(numList);
		
		
		System.out.println();
		System.out.println("After sort");
		
		for(Integer each:numList)
		{
			System.out.println(each);
		}
		
		System.out.println("----------------------------------------------------------");
		
		int codes[] = new int[] {110, 101,105,120,130,125};
		System.out.println("Before sort");
		
		
		
		
		for(int each:codes)
		{
			System.out.println(each);
		}
		Arrays.sort(codes);
		
		
		System.out.println();
		System.out.println("After sort");
		
		for(Integer each:codes)
		{
			System.out.println(each);
		}
		
		System.out.println("----------------------------------------------------------");
			
	
		
		
	}
	
	

}
