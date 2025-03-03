package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class factorail {
	@Test
public static void main()
{
	Scanner src=new Scanner(System.in);
	System.out.print("Enter a number");
	int fac=1;
	int input=src.nextInt();
	for(int i=1;i<=input;i++)
	{
		fac=fac*i;
	}
	System.out.println("factorail of '"+input+"' is :"+fac);
}
}
