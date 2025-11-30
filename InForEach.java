package com.kartik;

import java.util.Arrays;
import java.util.List;

public class InForEach {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("Kartik", "kar", "tik");
		names.forEach(item-> System.out.println(item));
	}

}
