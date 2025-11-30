//Take any input string and reverse it manually (without using StringBuilder.reverse()).

package com.kartik.simplestuff;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input=sc.nextLine();
		
		String reversed="";
		for(int i=input.length()-1; i>=0;i--) {
			reversed+=input.charAt(i);
		}
		System.out.println("String: "+ reversed);
		sc.close();
	}

}
