package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class stringpalindrom {
	@Test
	public void main()
	{
		String s="";
		Scanner src=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String valu=src.nextLine();
		
		
		for(int i=0;i<=valu.length()-1;i++)
		{
			char reversev=valu.charAt(i);
			s=reversev+s;
		}
		if(valu.equals(s)) {
			System.out.println("string is palindrom:"+s);
		}
		else
		{
			System.out.println("string is not palindrom:"+s);			
		}
	}

}
