package com_Epam_Pre_Training.Task3.view;

public class View {
	public static void printMaxDigit(int maxDigit) {
		System.out.println("Максимальная цифра: " + maxDigit);
	}

	public static void printIsPalindrome(int number, boolean bool) {
		System.out.println("Проверка числа " + number + " на палиндром равна  " + bool);
	}

	public static void printIsSimple(int number, boolean bool) {
		System.out.println("Проверка числа " + number + " на простоту равно  " + bool);
	}

	public static void printSimpleDivisors(int number, String divisors) {
		System.out.println("Простые делители числа " + number + " : " + divisors);
	}

	public static void printGreatestSimpleDivisor(int firstNumber, int secondNumber, int divisor) {
		System.out.println("НОД чисел " + firstNumber + " и " + secondNumber + " равен " + divisor);
	}

	public static void printLeastCommonMultiple(int firstNumber, int secondNumber, int multiple) {
		System.out.println("НОК чисел " + firstNumber + " и " + secondNumber + " равен " + multiple);
	}

	public static void printDifferentsDigigts(int number, int quantity) {
		System.out.println("Количество различных цифр числа " + number + " равно " + quantity);
	}

	public static void printIsPerfect(int number, boolean bool) {
		System.out.println("Проверка числа " + number + " на совершенство равно  " + bool);
	}
}
