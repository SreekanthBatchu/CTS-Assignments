package com.java8.samples;

import java.util.function.Function;

public class FunctionalInterfaceStringLength {

	public static void main(String[] args) {
		Function<String, Integer> function = s->s.length();
		System.out.println("The length of given string is : " + function.apply("Hello User"));
	}
}
