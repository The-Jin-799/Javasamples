package com.ibm.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		String str1;
		Scanner input = new Scanner(System.in);
		str1=input.nextLine();
		int flag=0;
		int revitr=str1.length()-1;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str1.charAt(revitr)) {
				flag=1;
				break;
			}
			revitr--;
		}
		if(flag==1)
		{
			System.out.println("Not Palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
		

	}

}
