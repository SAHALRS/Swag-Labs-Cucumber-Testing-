package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class palindrom {
	@Test
	public static void main()
	{
		int num,rem=0,nu;
	
	Scanner src=new Scanner(System.in);
	System.out.println("Enter a number");
    nu=src.nextInt();
    num=nu;
 
	while(num>0)
	{
		int k=num%10;
		rem=rem*10*num+k;
		num=num/10;
	}
	if(nu==rem)
	{
		System.out.println("Number is palindrom: "+nu);
	}
	else {
		System.out.println("Number is not palindrom: "+nu);
	}
	}}

