package com.java8.samples;

import java.util.function.Consumer;

public class ConsumerStringPrints {

	public static void main(String[] args) {
		Consumer<String> consumer = System.out::println;
		consumer.accept("Heello User");
	}

}
