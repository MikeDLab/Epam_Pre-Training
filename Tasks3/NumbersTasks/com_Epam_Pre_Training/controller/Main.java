package com_Epam_Pre_Training.Task3.controller;

import com_Epam_Pre_Training.Task3.model.NaturalNumberException;
import com_Epam_Pre_Training.Task3.model.Numbers;
import com_Epam_Pre_Training.Task3.view.View;

public class Main {

	public static void main(String[] args) throws NaturalNumberException {
		// TODO Автоматически созданная заглушка метода
		int number = 58799785;
		int firstNumber = 24;
		int secondNumber = 12;
		executeFisrtTask(number);
		executeSecondTask(number);
		executeThirdTask(number);
		executeFourthTask(number);
		executeFifthTask(firstNumber, secondNumber);
		executeSixthTask(number);
		executeSeventhTask(number);
	}

	public static void executeFisrtTask(int number) throws NaturalNumberException {//Максимальная цифра числа
		
		View.printMaxDigit(Numbers.findMaxDigit(number));
	}

	public static void executeSecondTask(int number) throws NaturalNumberException {//Проверка числа на палиндром
		View.printIsPalindrome(number, Numbers.isPalindrom(number));
	}

	public static void executeThirdTask(int number) throws NaturalNumberException {//Проверка числа на простоту
		View.printIsSimple(number, Numbers.isSimple(number));
	}

	public static void executeFourthTask(int number) throws NaturalNumberException {//Поиск простых делителей
		View.printSimpleDivisors(number, Numbers.findSimpleDivisors(number));
	}

	public static void executeFifthTask(int firstNumber, int secondNumber) throws NaturalNumberException {//Вычисление НОК и НОД
		View.printGreatestSimpleDivisor(firstNumber, secondNumber,
				Numbers.findGreatestCommonDivisor(firstNumber, secondNumber));
		View.printLeastCommonMultiple(firstNumber, secondNumber,
				Numbers.findLeastCommonMultiple(firstNumber, secondNumber));
	}

	public static void executeSixthTask(int number) throws NaturalNumberException {//Количество различных цифр числа
		View.printDifferentsDigigts(number, Numbers.countDifferentDigits(number));
	}

	public static void executeSeventhTask(int number) throws NaturalNumberException {//Проверка числа на совершенство
		View.printIsPerfect(number, Numbers.isPerfect(number));
	}

	

}
