package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ".");
	}
	
	//In order to provide the best rates to users, you need a way to map from the loan year to best rate available.
	//
	//Inside BestLoanRates.java, create a new variable called bestRates. This variable must be public, static, and final (so that it is immutable once it is created).
	// The type of bestRates must be Map<Integer, Float>.
	// You will need to import java.util.Map to use Map in this step. Initialize this variable using the Map.of() syntax so that the values can be provided right here.
	//
	//Add 3 key-value pairs. Add 1, 5.50f, 2, 3.45f, 3, 2.67f as the argument to Map.of().
	// This is a way of saying that for a loan of 1 year, the best rate is 5.50%, for 2 years the best rate is 3.45% and for 3 years the best rate is 2.67%.
	public static final Map<Integer, Float > bestRates = Map.of(
			1, 5.50f,
			2, 3.45f,
			3, 2.67f );
	{ }
	
	public static float getRates(int loanTermInYears) {
		return 0.0f;
	}

}
