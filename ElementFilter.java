package com.kartik.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementFilter {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("kartik", "emmi", "hashmi");
		
		List<String> jnames=names.stream().filter(name->name.startsWith("e")).collect(Collectors.toList());
		System.out.println(jnames);
		
	}

}
