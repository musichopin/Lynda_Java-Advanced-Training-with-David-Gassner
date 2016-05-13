package com.lynda.javatraining;

import java.text.NumberFormat;

public class NumericLiteralDemo {

	public static void main(String[] args) {
		int numberOfOlives = 1_000_000_000;
		NumberFormat formatter = NumberFormat.getInstance();
//		calling the static method of the NumberFormat class
//		while instantiating the NumberFormat class
		System.out.println(formatter.format(numberOfOlives));
		System.out.println(numberOfOlives+1);
	}

}
/*
1.000.000.000
1000000001 
 */
