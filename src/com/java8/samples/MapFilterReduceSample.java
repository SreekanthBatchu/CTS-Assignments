package com.java8.samples;

import java.util.Arrays;
import java.util.List;

public class MapFilterReduceSample {

	public static void main(String[] args) {
		List<String> values = Arrays.asList("Hello", "How", "are", "Your", "Preparation");
		String val = values.stream().map(s->s.toUpperCase())
				.filter(s->s.length()>4).reduce("", (a,b) -> a+b);
		System.out.println("Concatenated Reduced String is :" + val);
	}

}
