package com_Epam_Pre_Training.Task3.controller;

import com_Epam_Pre_Training.Task3.model.Coin;
import com_Epam_Pre_Training.Task3.view.View;

public class Main {

	public static void main(String[] args) throws NaturalNumberException {
		// TODO Автоматически созданная заглушка метода
		int quantityToss = 100;
		executeCoinTask(quantityToss);
	}
	public static void executeCoinTask(int quantityToss) throws NaturalNumberException
	{
		View.printEagles(quantityToss, Coin.tossCoin(quantityToss));
	}
}
