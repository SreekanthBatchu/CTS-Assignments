package com.java8.samples;

public class LambdaExamples {

	public static void main(String[] args) {
		SumInterface sum = (x,y) -> x+y;
		int result = sum.sum(4, 5);
		System.out.println("The sum of two number is : " + result);
	}
}
