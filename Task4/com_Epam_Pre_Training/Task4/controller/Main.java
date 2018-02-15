package com_Epam_Pre_Training.Task4.controller;

import com_Epam_Pre_Training.Task4.model.HanoiTower;
import com_Epam_Pre_Training.Task4.model.NaturalNumberException;
import com_Epam_Pre_Training.Task4.model.Numbers;
import com_Epam_Pre_Training.Task4.model.Validator;
import com_Epam_Pre_Training.Task4.model.ZeroNumberException;
import com_Epam_Pre_Training.Task4.view.View;

public class Main {

	public static void main(String[] args) throws NaturalNumberException, ZeroNumberException {
		// TODO Автоматически созданная заглушка метода
		int number = 1234567;
		int pow = 4;
		int num = 2;
		int sum = 28;
		char from = 'A';
		char to = 'B';
		char buffer = 'C';
		int numberFib = 4;
		executeFirstTask(number);
		executeSecondTask(num, pow);
		executeThirdTask(number, sum);
		executeFourthTaskTask(numberFib);
		executeFifthTask(3, from, to, buffer);
	}

	public static void executeFirstTask(int number) throws NaturalNumberException {
		Validator.validateOnNatural(number);
		View.view("Сумма цифр числа " + number + "  равна " + Numbers.countDigits(number));
	}

	public static void executeSecondTask(int number, int power) throws ZeroNumberException {
		try {
			View.view(number + " в степени " + power + " == " + Numbers.pow(number, power));
		} catch (StackOverflowError e) {
			System.err.println("Ввели слишком большие значения");
		}
	}

	public static void executeThirdTask(int number, int sum) throws NaturalNumberException {
		View.view("Равенство суммы цифр числа " + number + " и числа " + sum + " равно " + Numbers.equals(number, sum));
	}

	public static void executeFourthTaskTask(int number) throws NaturalNumberException {
		try {
			View.view("Число Фибоначчи под номером " + number + " есть " + Numbers.findFibonacci(number));
		} catch (StackOverflowError e) {
			System.err.println("Ввели слишком большой номер");
		}
	}

	public static void executeFifthTask(int ringsQuantity, char from, char to, char buffer)
			throws NaturalNumberException {
		try {
			View.view(HanoiTower.toStringHahoiTower(ringsQuantity, from, to, buffer));
		} catch (StackOverflowError e) {
			System.err.println("Ввели слишком большой номер");
		}
	}

}
