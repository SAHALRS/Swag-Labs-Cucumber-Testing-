package pkg;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[])
	{
int num ,i,fact=1;
Scanner src=new Scanner(System.in);
System.out.println("enter a number");
num=src.nextInt();
for(i=num;i>0;i--);
{
	fact=fact*i;
	
}
System.out.println("factorial of "+num+"is"+fact);
}
}