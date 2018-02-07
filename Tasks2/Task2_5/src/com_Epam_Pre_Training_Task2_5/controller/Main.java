package com_Epam_Pre_Training_Task2_5.controller;

import java.util.Scanner;

import com_Epam_Pre_Training_Task2_5.model.Numbers;
import com_Epam_Pre_Training_Task2_5.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		System.out.println("***Название числа в виде строки***");
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число:");
		int number = in.nextInt();
		String numberInString = Numbers.toString(number);
		View.printNumberInString(numberInString);
	}

}
