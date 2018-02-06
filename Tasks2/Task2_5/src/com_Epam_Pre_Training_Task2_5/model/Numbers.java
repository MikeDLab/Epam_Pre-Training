package com_Epam_Pre_Training_Task2_5.model;

public class Numbers {

	public static String toString(int number) {
		String numbers = "";
		switch (number / 100) {
		case 1:
			numbers += "Сто ";
			break;
		case 2:
			numbers += "Двести ";
			break;
		case 3:
			numbers += "Триста ";
			break;
		case 4:
			numbers += "Четыреста ";
			break;
		case 5:
			numbers += "Пятьсот ";
			break;
		case 6:
			numbers += "Шестьсот ";
			break;
		case 7:
			numbers += "Семьсот ";
			break;
		case 8:
			numbers += "Восемсот ";
			break;
		case 9:
			numbers += "Девятьсот ";
			break;
		default:
			numbers += "";
		}
		switch ((number - 100 * (number / 100)) / 10) {
		case 1:
			switch ((number - 100 * (number / 100)) % 10) {
			case 0:
				numbers += "десять ";
				break;
			case 1:
				numbers += "одинадцать ";
				break;
			case 2:
				numbers += "двенадцать ";
				break;
			case 3:
				numbers += "тринадцать ";
				break;
			case 4:
				numbers += "четырнадцать ";
				break;
			case 5:
				numbers += "пятнадцать ";
				break;
			case 6:
				numbers += "шестнадцать";
				break;
			case 7:
				numbers += "семнадцать ";
				break;
			case 8:
				numbers += "восемнадцать ";
				break;
			case 9:
				numbers += "девятнадцать ";
				break;
			default:
				numbers += "";
			}
			return numbers;
		case 2:
			numbers += "двадцать ";
			break;
		case 3:
			numbers += "тридцать ";
			break;
		case 4:
			numbers += "сорок ";
			break;
		case 5:
			numbers += "пятьдесят ";
			break;
		case 6:
			numbers += "шестьдесят ";
			break;
		case 7:
			numbers += "семдесят ";
			break;
		case 8:
			numbers += "восемьдесят ";
			break;
		case 9:
			numbers += "девяносто ";
			break;
		default:
			numbers += "";
		}
		switch (number % 10) {
		case 0:
			if (number % 100 != 0 || number % 1000 != 0) {
				numbers += "";
			} else {
				numbers += "ноль";
			}
			break;
		case 1:
			numbers += "один ";
			break;
		case 2:
			numbers += "два ";
			break;
		case 3:
			numbers += "три ";
			break;
		case 4:
			numbers += "четыре ";
			break;
		case 5:
			numbers += "пять ";
			break;
		case 6:
			numbers += "шесть ";
			break;
		case 7:
			numbers += "семь ";
			break;
		case 8:
			numbers += "восемь ";
			break;
		case 9:
			numbers += "девять ";
			break;
		default:
			numbers += "";
		}
		return numbers;
	}

}
