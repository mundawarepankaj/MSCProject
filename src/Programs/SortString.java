package Programs;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = "bcdaaef";
		
		char charArray[] = str.toCharArray();
		
		
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		
		//sortedString = charArray.toString();
	
		System.out.println(sortedString);
	
	}

}
