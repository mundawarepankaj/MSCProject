package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurenceOfDuplicateChars
{
	public Map countChar(String str)
	{
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		
		for(int i = str.length()-1; i>0; i--)
		{
			if(hmap.containsKey(str.charAt(i)))
			{
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
				
			}
			
			else
			{
				hmap.put(str.charAt(i), 1);
			}
		}
		
		return hmap;
		
	}
	

	public static void main(String[] args) 
	{
		CountOccurenceOfDuplicateChars obj = new CountOccurenceOfDuplicateChars();
		
		String str; 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string of your choice");
		
		str = in.nextLine();
		Map<Character, Integer> hmapRetrun = new HashMap<Character, Integer>();
		hmapRetrun = obj.countChar(str);
		System.out.println(hmapRetrun);
		
		
		
	}

}
