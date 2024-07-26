
package aaa;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][]arr=new String[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your username and password");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.next();
			}
			System.out.println();
			
			}
		System.out.println("enter values:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
					
					
				

	}

}
