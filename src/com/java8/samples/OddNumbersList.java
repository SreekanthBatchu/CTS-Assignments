package com.java8.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersList {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> oddNumbers = values.stream().filter(o -> o%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbers);
	}
}
