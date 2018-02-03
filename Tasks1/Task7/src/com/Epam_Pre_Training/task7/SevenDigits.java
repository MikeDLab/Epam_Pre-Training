package com.Epam_Pre_Training.task7;

public class SevenDigits {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int number = 1234567;
		System.out.println("Результат: " + reverseNumber(number));
	}

	public static int reverseNumber(int number) {
		int revers = (number % 10);
		revers = (revers *=10) +(number /= 10) % 10;
		revers = (revers *=10) +(number /= 10) % 10;
		revers = (revers *=10) +(number /= 10) % 10;
		revers = (revers *=10) +(number /= 10) % 10;
		revers = (revers *=10) +(number /= 10) % 10;
		revers = (revers *=10) +(number /= 10) % 10;
		return revers;
	}

}
