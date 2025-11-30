//Find the Second Highest Number in an Array Using Streams

package com.kartik.simplestuff;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		
		int[] arr= {10, 30, 40, 20, 60};
		
		int secondHighest= Arrays.stream(arr)
							.boxed()
							.distinct()
							.sorted((a,b)->(b-a)).skip(1)
							.findFirst()
							.orElseThrow(()->new RuntimeException("No second highest."));
		
		System.out.println("Second Highest number is: "+secondHighest);
	}

}
