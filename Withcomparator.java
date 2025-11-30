package com.kartik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Withcomparator {
	public static void main(String args[]) {
		List<String> names=Arrays.asList("kartik", "kar", "tik");
		Collections.sort(names, (s1, s2)->s1.length()-s2.length());
		System.out.println(names);
	}

}
