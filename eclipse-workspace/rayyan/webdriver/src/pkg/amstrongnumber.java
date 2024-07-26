package pkg;

import java.util.Scanner;

public class amstrongnumber {
	public static void main(String[]args) {
		int n,nu,num=0,rem;
		Scanner src=new Scanner(System.in);
		n=src.nextInt();
		
		nu=n;
		
		while(nu!=0)
		{
			rem=nu%10;
			num=num+rem*rem*rem;
			nu=n/10;
			
		}
		if(num==n) {
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not amstrong number");
			
			
		}
		
	}
	

}
