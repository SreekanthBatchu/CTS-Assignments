package com.java8.samples;

public class RunnableLambda {

	public static void main(String[] args) {
		Runnable run = () ->System.out.println("A simple runnable interface");
		new Thread(run).start();
	}
}
