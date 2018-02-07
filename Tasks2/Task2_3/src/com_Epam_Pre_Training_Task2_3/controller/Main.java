package com_Epam_Pre_Training_Task2_3.controller;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import com_Epam_Pre_Training_Task2_3.View.View;
import com_Epam_Pre_Training_Task2_3.model.MoodSensor;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Автоматически созданная заглушка метода
		int number = new Random().nextInt(10);
		char[] emodji = MoodSensor.checkMood(number);
		String mood = MoodSensor.getMoodName(number);
		View.printMood(emodji, mood);
	}

}
