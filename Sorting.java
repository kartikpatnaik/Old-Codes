package com.kartik.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> num=Arrays.asList(1, 13, 35, 66, 18);
		List<Integer> nums=num.stream().sorted().collect(Collectors.toList());
		System.out.println(nums);
	}

}
