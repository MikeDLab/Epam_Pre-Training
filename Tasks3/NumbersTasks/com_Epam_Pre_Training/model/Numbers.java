package com_Epam_Pre_Training.Task3.model;

public class Numbers {
	public static int findMaxDigit(int number) {
		int maxDigit = number % 10;
		while (number != 0) {
			if (maxDigit == 9) {
				return maxDigit;
			}
			maxDigit = (number /= 10) % 10 > maxDigit ? (number % 10) : maxDigit;
		}
		return maxDigit;
	}

	public static boolean isPalindrom(int number) {
		return number == reverseNumber(number);
	}

	private static int reverseNumber(int number) {
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number /= 10;
		}
		return revNumber;
	}

	public static boolean isSimple(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static String findSimpleDivisors(int number) {
		String divisors = "";
		for (int divisor = 2; divisor <= number; divisor++) {
			if (number % divisor == 0 && isSimple(divisor)) {
				divisors += Integer.toString(divisor) + " ";
			}
		}
		return divisors;
	}

	public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
		int buffer;
		while (firstNumber != secondNumber) {
			if (firstNumber > secondNumber) {
				buffer = firstNumber;
				firstNumber = secondNumber;
				secondNumber = buffer;
			}
			secondNumber -= firstNumber;
		}
		return firstNumber;
	}

	public static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
		return secondNumber * firstNumber / findGreatestCommonDivisor(firstNumber, secondNumber);
	}

	public static int countDifferentDigits(int number) {
		String digits = Integer.toString(number % 10);
		while (number != 0) {
			digits += (!digits.contains(Integer.toString(number % 10))) ? Integer.toString(number % 10) : "";
			number /= 10;
		}
		return digits.length();
	}

	public static boolean isPerfect(int number) {
		int sum = 0;
		int divisor = 1;
		while (divisor != number) {
			if (number % divisor == 0) {
				sum += divisor;
			}
			divisor++;
		}
		return sum == number;
	}
}
