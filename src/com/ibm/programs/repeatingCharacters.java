package com.ibm.programs;

import java.util.Arrays;
import java.util.Scanner;

public class repeatingCharacters {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str1;
		Scanner input = new Scanner(System.in);
		str1=input.nextLine();
		char[] ch = str1.toCharArray();
		int ind = 0;
		  
     
        for (int i = 0; i < str1.length(); i++)
        {
  
            int j;
            for (j = 0; j < i; j++) 
            {
                if (ch[i] == ch[j])
                {
                    break;
                }
            }
            if (j == i) 
            {
                ch[ind++] = ch[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(ch, ind)));

	}

}
