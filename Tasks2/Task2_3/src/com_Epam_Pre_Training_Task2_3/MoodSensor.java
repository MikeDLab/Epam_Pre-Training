package com_Epam_Pre_Training_Task2_3;

import java.io.UnsupportedEncodingException;
import java.math.*;
import java.util.Random;

public class MoodSensor {
	public static void main(String[] args) throws UnsupportedEncodingException {
		int n = new Random().nextInt(10);
		viewMood(n);
	}

	public static void viewMood(int n) throws UnsupportedEncodingException {
		System.out.print(getMoodName(n));
		System.out.print(checkMood(n)[0]);
		System.out.print(checkMood(n)[1]);
	}

	public static String getMoodName(int n) {
		switch (n) {
		case 0: {// улыбка
			return "Улыбчивое ";
		}
		case 1: {// сонливое
			return "Сонливое ";
		}
		case 2: {// злое
			return "Злое ";
		}
		case 3: { // нейтральное
			return "Нейтральное ";
		}
		case 4: {// смущение
			return "Смущение ";
		}
		case 5: { // стыд
			return "Стыд ";
		}
		case 6: { // задумчивость
			return "Задумчивость ";
		}
		case 7: {// разочарование
			return "Разочарование ";
		}
		case 8: {// страх
			return "Страх ";
		}
		case 9: {// удивление
			return "Удивление ";
		}
		default:
			return "";

		}
	}

	public static char[] checkMood(int n) throws UnsupportedEncodingException {
		char emodji[];
		char firstSymbolsPart, secondSymbolsPart;
		int codePoint;
		switch (n) {
		case 0: {// улыбка
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde00;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 1: {// сонливое
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde2a;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 2: {// злое
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde20;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 3: { // нейтральное
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde10;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 4: {// смущение
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde15;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 5: { // стыд
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde16;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 6: { // задумчивость
			firstSymbolsPart = 0xd83d;
			;
			secondSymbolsPart = 0xde14;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 7: {// разочарование
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde1e;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 8: {// страх
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde31;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		case 9: {// удивление
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde32;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
		default:
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde11;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			return emodji;
		}
	}

}
