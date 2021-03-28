package com.praveena.clacualtor;

public class Test {

	public static void main(String[] args) {
		
		calc c1 = new calc();
		int sum = c1.add(3, 2);
		int diff = c1.subtract(3, 2);
		System.out.println("Sum="+ sum);
		System.out.println("Difference="+ diff);
		stringoperations so = new stringoperations();
		so.stringToLower("HELLO WORLD!!");

	}

}
