package com_Epam_Pre_Training_Task2_5;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("***Название числа в виде строки***");
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число:");
		int N = in.nextInt();
		System.out.println("Число в виде строки: " + toString(N));
	}

	public static String toStringHundreds(int number) {
		switch (number / 100) {
		case 1:
			return "Сто ";
		case 2:
			return "Двести ";
		case 3:
			return "Триста ";
		case 4:
			return "Четыреста ";
		case 5:
			return "Пятьсот ";
		case 6:
			return "Шестьсот ";
		case 7:
			return "Семьсот ";
		case 8:
			return "Восемсот ";
		case 9:
			return "Девятьсот ";
		default:
			return "";
		}
	}

	public static String toStringTens(int number) {
		switch ((number - 100 * (number / 100)) / 10) {
		case 1:
			switch ((number - 100 * (number / 100)) % 10) {
			case 0:
				return "десять ";
			case 1:
				return "одинадцать ";
			case 2:
				return "двенадцать ";
			case 3:
				return "тринадцать ";
			case 4:
				return "четырнадцать ";
			case 5:
				return "пятнадцать ";
			case 6:
				return "шестнадцать";
			case 7:
				return "семнадцать ";
			case 8:
				return "восемнадцать ";
			case 9:
				return "девятнадцать ";
			default:
				return "";
			}
		case 2:
			return "двадцать ";
		case 3:
			return "тридцать ";
		case 4:
			return "сорок ";
		case 5:
			return "пятьдесят ";
		case 6:
			return "шестьдесят ";
		case 7:
			return "семдесят ";
		case 8:
			return "восемьдесят ";
		case 9:
			return "девяносто ";
		default:
			return "";
		}
	}

	public static String toStringDigits(int number) {
		switch (number % 10) {
		case 0:
			if (number % 100 != 0 || number % 1000 != 0) {
				return "";
			} else {
				return "ноль";
			}
		case 1:
			return "один ";
		case 2:
			return "два ";
		case 3:
			return "три ";
		case 4:
			return "четыре ";
		case 5:
			return "пять ";
		case 6:
			return "шесть ";
		case 7:
			return "семь ";
		case 8:
			return "восемь ";
		case 9:
			return "девять ";
		default:
			return "";
		}
	}

	public static String toString(int number) {
		return toStringHundreds(number) + toStringTens(number) + toStringDigits(number);
	}
}
