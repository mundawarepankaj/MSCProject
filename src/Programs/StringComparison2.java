package Programs;

import java.util.Scanner;

public class StringComparison2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
			String str1 = "this is me!!!!";
			
			char charArray[] = str1.toCharArray();
			
			System.out.println(str1);
			for(int i = 0; i<charArray.length; i++)
			{
				System.out.println(charArray[i]);
			}
			
			System.out.println("---------------------------------------------");
			
			String first = "I love ";
			String second = "my INDIA";
			
			System.out.println("Concatenation --> "+first.concat(second));
			
			
			System.out.println("---------------------------------------------");

			
			String third = "I can make difference";
			System.out.println("--Replace Method--");
			System.out.println("Original String --> "+third);
			
			System.out.println("Converted String --> "+third.replaceAll("I", "We"));
			
			
			System.out.println("---------------------------------------------");
			
			String t = "this is india";
			
			String splitted[] = t.split(" ");
			
			for(int i = 0; i<splitted.length; i++)
			{
				System.out.println(splitted[i]);
			}
			
			System.out.println("------------------------------------------------");
			
			String str = "  this is me";
			System.out.println(str);
			System.out.println(str.trim());
			
			System.out.println("----------------------------------------------");
			
			
		String name = "inDiA";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println("------------------------------------------------------");
		
		String s = "this is just beginning!!";
		
		System.out.println("Char at===> "+s.charAt(2));
		System.out.println("index of ===> "+s.indexOf('s'));
		System.out.println("last index of s==> "+s.lastIndexOf('s'));
		System.out.println("Length of string --> "+s.length());
		System.out.println("Replacing characters of string....Old String "+s+"Updated string "+s.replace(" ", "/"));
		
		System.out.println("-------------------------------");
		
		String alphabets = "this@is$12567india";
		
		String regex = "[@$0-9]";
		
		String characters = "";
		String inputData = "";
		
		
		
		for(int i =0; i<alphabets.length(); i++)
		{
			char ch = alphabets.charAt(i);
			
			if(alphabets.valueOf(ch).matches(regex))
			{
				characters = characters+ch;
			}
			else
			{
				inputData = inputData+ch;
			}
		
		}
		
		System.out.println("Updated string is = "+inputData+characters);

		System.out.println("-------------------------------------------------");

		
		String combined = "this*$Is@3#India98332aa2112";
		String alphabet = "";
		String symbols = "";
		
		String rgEx = "[0-9*$@#]";
		
		
		for(int i = 0; i<combined.length(); i++)
		{
			char ch = combined.charAt(i);
			
			if(combined.valueOf(ch).matches(rgEx))
			{
				alphabet = alphabet+ch;
			}
			else
			{
				symbols = symbols+ch;
			}
		}
		
		System.out.println(symbols+alphabet);
		
		System.out.println("------------------------------------------------");
		
		String misc = "thi3922s222@@i2444$$3%%%%434aTH3434EbeGin";
		
		String regx = "[@$%0-9]";
		
		String chars= "";
		String symbol = "";
		
		
		for(int i = 0; i<misc.length(); i++)
		{
			char c = misc.charAt(i);
			
			if(misc.valueOf(c).matches(regx))
			{
				symbol = symbol+c;
			}
			else
			{
				chars = chars+c;
			}
		}
		
		System.out.println(chars+symbol);
		System.out.println("------------------------------------------------");
		
		System.out.println("Reverse of string method first");
		String prog = "java programmer";
		char reverse[] = new char[prog.length()];
		
		System.out.println("Original string = "+prog);
		for(int i = prog.length()-1; i>=0; i--)
		{
		
			//char ch = prog.charAt(i);
		   reverse[i] = prog.charAt(i);
		   
			//System.out.print(prog.charAt(i));
		}
		
		System.out.print("Reverse string = ");
		for(int i = reverse.length-1; i>=0; i--)
		{
			System.out.print(reverse[i]);
		}

		System.out.println();
		System.out.println("------------------------------------------------");
		
		String initial, rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		initial=in.nextLine();
		int length=initial.length();
		for(int i=length-1;i>=0;i--)
		  rev=rev+initial.charAt(i);
		System.out.println("Reversed string: "+rev);
		
		System.out.println("------------------------------------------------");
		

		System.out.println("------------------------------------------------");
	
		
	}

}
