package com.kartik.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MappingElement {

	public static void main(String[] args) {

		List<String> name=Arrays.asList("kartik", "emmi");
		List<String> upper=name.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upper);
	}

}
