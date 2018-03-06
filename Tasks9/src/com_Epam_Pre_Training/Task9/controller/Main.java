package com_Epam_Pre_Training.Task9.controller;

import java.io.IOException;
import com_Epam_Pre_Training.Task9.model.NoFileException;
import com_Epam_Pre_Training.Task9.model.TextParser;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		String inputFirstTaskFile = "firstTask.txt";
		String outputFirstTaskFile = "firstTaskResult.txt";
		String inputSecondTaskFile = "secondTask.txt";
		String outputSecondTaskFile = "secondTaskResult.txt";
		executeFirstTask(inputFirstTaskFile, outputFirstTaskFile);
		executeSecondTask(inputSecondTaskFile, outputSecondTaskFile);

	}
	//В каждом предложении текста поменять местами первое слово с последним,
	//не изменяя длины предложения.
	public static void executeFirstTask(String inputFile, String outputFile) {
		TextParser parser = TextParser.TEXTPASER;
		try {
			parser.swapFirstAndLastWords(inputFile, outputFile);
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			throw new NoFileException();
		}

	}
	//Найти такое слово в первом предложении, которого нет ни в одном из
	//остальных предложений.
	public static void executeSecondTask(String inputFile, String outputFile) {
		TextParser parser = TextParser.TEXTPASER;
		try {
			parser.getUniqueWords(inputFile, outputFile);
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			throw new NoFileException();
		}
	}

}