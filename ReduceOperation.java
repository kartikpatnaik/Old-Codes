package com.kartik.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceOperation {

	public static void main(String[] args) {

		List<Integer> nums=Arrays.asList(1,2, 4, 5 , 19);
		int sum=nums.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
