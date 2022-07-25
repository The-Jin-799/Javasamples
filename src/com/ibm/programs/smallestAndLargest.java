package com.ibm.programs;

import java.util.Scanner;

public class smallestAndLargest {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of elements");	
		int n= input.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		int s= Integer.MAX_VALUE, l=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<s)
			{
				s=arr[i];
			}
			if(arr[i]>l)
			{
				l=arr[i];
			}
		}
		System.out.println("Smallest: "+s);
		System.out.println("Largest: "+l);
		

	}

}
