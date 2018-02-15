package com_Epam_Pre_Training.Task4.model;

import com_Epam_Pre_Training.Task4.model.ZeroNumberException;
import com_Epam_Pre_Training.Task4.model.NaturalNumberException;

public class Numbers {
	public static int countDigits(int number) throws NaturalNumberException {
		return number > 0 ? number % 10 + countDigits(number / 10) : 0;
	}

	public static int pow(int number, int power) throws ZeroNumberException {
		Validator.validateOnZeroValue(number);
		return power > 0 ? number * pow(number, power - 1) : 1;
	}

	public static boolean equals(int number, int sum) throws NaturalNumberException {
		Validator.validateOnNatural(number, sum);
		return sum == countDigits(number);
	}

	public static int findFibonacci(int number) {
		if (number <= 2 && number > 0) {
			return number - 1;
		}
		return number > 0 ? findFibonacci(number - 1) + findFibonacci(number - 2) : -1;
	}
}
