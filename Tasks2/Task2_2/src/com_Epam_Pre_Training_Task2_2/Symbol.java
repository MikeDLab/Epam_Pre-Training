package com_Epam_Pre_Training_Task2_2;

import java.util.Scanner;

public class Symbol {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char symbol = in.next().charAt(0);
		System.out.println(checkOnVowels(symbol));
		System.out.println(checkOnVowels2(symbol));
		System.out.println(checkOnVowels3(symbol));
		System.out.println(checkOnVowels4(symbol));
		System.out.println(checkOnVowels5(symbol));
	}

	public static boolean checkOnVowels(char symbol) {
		symbol = Character.toUpperCase(symbol);
		switch (symbol) {
		case 'А':
			return true;
		case 'О':
			return true;
		case 'Е':
			return true;
		case 'Ё':
			return true;
		case 'И':
			return true;
		case 'Ю':
			return true;
		case 'Я':
			return true;
		case 'Э':
			return true;
		case 'Ы':
			return true;
		case 'У':
			return true;
		default:
			return false;
		}
	}

	public static boolean checkOnVowels2(char symbol) {
		symbol = Character.toUpperCase(symbol);
		if (symbol == 'А') {
			return true;
		} else if (symbol == 'О') {
			return true;
		} else if (symbol == 'Е') {
			return true;
		} else if (symbol == 'Ё') {
			return true;
		} else if (symbol == 'И') {
			return true;
		} else if (symbol == 'У') {
			return true;
		} else if (symbol == 'Ы') {
			return true;
		} else if (symbol == 'Э') {
			return true;
		} else if (symbol == 'Я') {
			return true;
		} else if (symbol == 'Ю') {
			return true;
		}
		return false;
	}

	public static boolean checkOnVowels3(char symbol) {
		String vowels = "АОЕЁИУЫЯЮЭ";
		String symbolInString = String.valueOf(symbol);
		symbolInString = symbolInString.toUpperCase();
		return vowels.contains(symbolInString);
	}

	public static boolean checkOnVowels4(char symbol) {
		if (symbol == '\u0410' || symbol == '\u0430') {
			return true;
		} else if (symbol == '\u041E' || symbol == '\u043E') {
			return true;
		} else if (symbol == '\u0415' || symbol == '\u0435') {
			return true;
		} else if (symbol == '\u0401' || symbol == '\u0451') {
			return true;
		} else if (symbol == '\u0418' || symbol == '\u0438') {
			return true;
		} else if (symbol == '\u0423' || symbol == '\u0443') {
			return true;
		} else if (symbol == '\u042B' || symbol == '\u044B') {
			return true;
		} else if (symbol == '\u042D' || symbol == '\u044D') {
			return true;
		} else if (symbol == '\u042E' || symbol == '\u044E') {
			return true;
		} else if (symbol == '\u042F' || symbol == '\u044F') {
			return true;
		}
		return false;
	}

	public static boolean checkOnVowels5(char symbol) {
		symbol = Character.toUpperCase(symbol);
		return symbol == 'А' || symbol == 'И' || symbol == 'О' || symbol == 'У' || symbol == 'Ы' || symbol == 'Э'
				|| symbol == 'Ю' || symbol == 'Я' ? true : false;
	}
}