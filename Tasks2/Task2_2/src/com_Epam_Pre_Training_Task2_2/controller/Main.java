package com_Epam_Pre_Training_Task2_2.controller;

import java.util.Scanner;

import com_Epam_Pre_Training_Task2_2.model.Symbol;
import com_Epam_Pre_Training_Task2_2.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		Scanner in = new Scanner(System.in);
		char symbol = in.next().charAt(0);
		View.printIsVowel(Symbol.checkOnVowels(symbol));
		View.printIsVowel(Symbol.checkOnVowels2(symbol));
		View.printIsVowel(Symbol.checkOnVowels3(symbol));
		View.printIsVowel(Symbol.checkOnVowels5(symbol));
	}

}
