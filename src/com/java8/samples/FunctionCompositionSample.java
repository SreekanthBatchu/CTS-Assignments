package com.java8.samples;

import java.util.function.Function;

public class FunctionCompositionSample {

	public static void main(String[] args) {
		Function<Integer, Integer> function1 = n->n*2;
		Function<Integer, Integer> function2 = n->n+3;
		
		Function<Integer, Integer> twoFunctions = function1.compose(function2);
		int result = twoFunctions.apply(10);
		System.out.println("The result is " + result);
	}
}
