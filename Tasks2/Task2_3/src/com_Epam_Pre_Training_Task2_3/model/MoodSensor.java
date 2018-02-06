package com_Epam_Pre_Training_Task2_3.model;

import java.io.UnsupportedEncodingException;
import java.math.*;
import java.util.Random;

public class MoodSensor {

	public static void viewMood(int n) throws UnsupportedEncodingException {
		
	}

	public static String getMoodName(int n) {
		String mood = "";
		switch (n) {
		case 0: {// улыбка
			mood = "Улыбчивое ";
			break;
		}
		case 1: {// сонливое
			mood = "Сонливое ";
			break;
		}
		case 2: {// злое
			mood = "Злое ";
			break;
		}
		case 3: { // нейтральное
			mood = "Нейтральное ";
		}
		case 4: {// смущение
			mood = "Смущение ";
			break;
		}
		case 5: { // стыд
			mood = "Стыд ";
			break;
		}
		case 6: { // задумчивость
			mood = "Задумчивость ";
			break;
		}
		case 7: {// разочарование
			mood = "Разочарование ";
			break;
		}
		case 8: {// страх
			mood = "Страх ";
			break;
		}
		case 9: {// удивление
			mood = "Удивление ";
			break;
		}
		default:
			mood = "";
			break;
		}
		return mood;
	}

	public static char[] checkMood(int n) throws UnsupportedEncodingException {
		char emodji[] = null;
		char firstSymbolsPart, secondSymbolsPart;
		int codePoint;
		switch (n) {
		case 0: {// улыбка
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde00;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 1: {// сонливое
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde2a;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 2: {// злое
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde20;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 3: { // нейтральное
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde10;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 4: {// смущение
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde15;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 5: { // стыд
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde16;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 6: { // задумчивость
			firstSymbolsPart = 0xd83d;
			;
			secondSymbolsPart = 0xde14;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 7: {// разочарование
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde1e;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 8: {// страх
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde31;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		case 9: {// удивление
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde32;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		default:
			firstSymbolsPart = 0xd83d;
			secondSymbolsPart = 0xde11;
			codePoint = Character.toCodePoint(firstSymbolsPart, secondSymbolsPart);
			emodji = Character.toChars(codePoint);
			break;
		}
		return emodji;
	}

}
