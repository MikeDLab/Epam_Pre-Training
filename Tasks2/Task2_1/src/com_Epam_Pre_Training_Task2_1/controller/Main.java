package com_Epam_Pre_Training_Task2_1.controller;

import com_Epam_Pre_Training_Task2_1.model.Dragon;
import com_Epam_Pre_Training_Task2_1.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		// TODO Автоматически созданная заглушка метода
		int dragonAge = 30;
		int heads = Dragon.countHeads(dragonAge);
		int eyes = Dragon.countEyes(heads);
		View.printEyes(eyes);
		View.printHeads(heads);
	}

}
