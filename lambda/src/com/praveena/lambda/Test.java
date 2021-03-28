package com.praveena.lambda;

public class Test {

	public static void main(String[] args) {
		
		//A a = new C();
		A a = ()-> System.out.println("From Lambda expression");
		a.show();
	}

}
