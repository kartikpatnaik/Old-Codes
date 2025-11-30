//Write a Java 8 program to count how many times each word appears in a list.

package com.kartik.simplestuff;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {

		List<String> words=Arrays.asList("apple", "tomato", "king", "king", "kind", "kind");
		
		Map<String, Long> wordCount=words.stream()
				.collect(Collectors.groupingBy(word-> word, Collectors.counting()));
		
		System.out.println(wordCount);
	}

}
