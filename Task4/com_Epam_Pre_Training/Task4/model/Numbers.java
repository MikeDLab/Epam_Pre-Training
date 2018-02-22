package com_Epam_Pre_Training.Task4.model;

public class Numbers {
	public static int countDigits(int number) {
		return number > 0 ? number % 10 + countDigits(number / 10) : 0;
	}

	public static int countDigitsWithIterations(int number) {
		int count = number % 10;
		while (number != 0) {
			count += (number /= 10) % 10;
		}
		return count;
	}

	public static int pow(int number, int power) {
		return power > 0 ? number * pow(number, power - 1) : 1;
	}

	public static int powWithIterations(int number, int pow) {
		int result = 1;
		for (int i = 0; i < pow; i++) {
			result *= number;
		}
		return result;
	}

	public static boolean equals(int number, int sum) {
		if (number > 0) {
			return equals(number / 10, sum -= number % 10);
		}
		return sum == number;
	}

	public static int findFibonacci(int number) {
		if (number <= 2 && number > 0) {
			return number - 1;
		}
		return number > 0 ? findFibonacci(number - 1) + findFibonacci(number - 2) : -1;
	}

	public static int findFibonacciWithIteration(int number) {
		int fibonacci1 = 0;
		int fibonacci2 = 1;
		int fibonacciNumber = 0;
		if (number <= 2 && number > 0) {
			return number - 1;
		}
		if (number > 0) {
			for (int i = 2; i < number; i++) {
				fibonacciNumber = fibonacci1 + fibonacci2;
				fibonacci1 = fibonacci2;
				fibonacci2 = fibonacciNumber;
			}
		} else {
			fibonacciNumber = -1;
		}
		return fibonacciNumber;
	}
}
