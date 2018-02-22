package com_Epam_Pre_Training.Task4.controller;

public class Validator {
	public static void validateOnNatural(int... numbers) throws NaturalNumberException {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 1) {
				throw new NaturalNumberException("Число " + numbers[i] + " не является натуральным числом");
			}
		}
	}

	public static void validateOnZeroValue(int n) throws ZeroNumberException {
		if (n == 0) {
			throw new ZeroNumberException("Число n не может быть равно 0");
		}
	}
}
