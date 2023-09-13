package com.java8.samples;

import java.util.function.Function;

public class FunctionalInterfaceStringConverion {

	public static void main(String[] args) {
		Function<String, String> function = s->s.toLowerCase();
		System.out.println("The converted string to lower case is : " + function.apply("HELLO USER"));
	}
}
