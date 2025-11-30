//Write a Java 8 program to find the sum of all even numbers in a list.

package com.kartik.simplestuff;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,7,8,8,9);
		
		int sum=list.stream().distinct().filter(n->n%2==0)
				.mapToInt(n->n).sum();
		
		System.out.println("Sum of Even Numbers: "+sum);
	}

}
