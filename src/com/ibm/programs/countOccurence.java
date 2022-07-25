package com.ibm.programs;

import java.util.Scanner;

public class countOccurence {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str1;
		Scanner input = new Scanner(System.in);
		str1=input.nextLine();
		System.out.println("Enter a character");
		char ch = input.next().charAt(0);
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count: "+count);
	}

}
