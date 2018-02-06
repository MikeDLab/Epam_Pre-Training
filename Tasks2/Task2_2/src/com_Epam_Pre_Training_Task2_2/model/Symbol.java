package com_Epam_Pre_Training_Task2_2.model;


public class Symbol {


	public static boolean checkOnVowels(char symbol) {
		symbol = Character.toUpperCase(symbol);
		switch (symbol) {
		case 'А':
		case 'О':
		case 'Е':
		case 'Ё':
		case 'И':
		case 'Ю':
		case 'Я':
		case 'Э':
		case 'Ы':
		case 'У':
			return true;
		default:
			return false;
		}
	}

	public static boolean checkOnVowels2(char symbol) {
		symbol = Character.toUpperCase(symbol);
		boolean isVowel=false;
		if (symbol == 'А') {
			isVowel = true;
		} else if (symbol == 'О') {
			isVowel = true;
		} else if (symbol == 'Е') {
			isVowel = true;
		} else if (symbol == 'Ё') {
			isVowel = true;
		} else if (symbol == 'И') {
			isVowel = true;
		} else if (symbol == 'У') {
			isVowel = true;
		} else if (symbol == 'Ы') {
			isVowel = true;
		} else if (symbol == 'Э') {
			isVowel = true;
		} else if (symbol == 'Я') {
			isVowel = true;
		} else if (symbol == 'Ю') {
			isVowel = true;
		}
		return isVowel;
	}

	public static boolean checkOnVowels3(char symbol) {
		String vowels = "АОЕЁИУЫЯЮЭ";
		String symbolInString = String.valueOf(symbol);
		symbolInString = symbolInString.toUpperCase();
		return vowels.contains(symbolInString);
	}

	public static boolean checkOnVowels5(char symbol) {
		symbol = Character.toUpperCase(symbol);
		return symbol == 'А' || symbol == 'И' || symbol == 'О' || symbol == 'У' || symbol == 'Ы' || symbol == 'Э'
				|| symbol == 'Ю' || symbol == 'Я' ;
	}
}