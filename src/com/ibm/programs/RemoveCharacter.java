package com.ibm.programs;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		String str1;
		Scanner input = new Scanner(System.in);
		str1=input.nextLine();
		System.out.println("Enter a character");
		char ch = input.next().charAt(0);
		String str2 = str1.replace(String.valueOf(ch), "");
		System.out.println("New string: "+str2);
		

	}

}
