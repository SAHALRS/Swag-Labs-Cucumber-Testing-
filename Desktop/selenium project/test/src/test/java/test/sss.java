package test;

import java.util.Scanner;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//revearse
		
		
		
		Scanner src=new Scanner(System.in);
		System.out.println("enter a string");
		String h=src.nextLine();
		String s="";
		char d;
	//int v=h.length();
		for(int i=0;i<h.length();i++)
		{
		 d=h.charAt(i);
		 s=d+s;
		 
		}
		System.out.println("output:"+s);
		
	}

}