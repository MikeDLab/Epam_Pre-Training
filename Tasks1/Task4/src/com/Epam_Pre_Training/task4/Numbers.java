package com.Epam_Pre_Training.task4;

public class Numbers {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int numbers = 1254;
		System.out.println("Ответ: " + checkNumbers(numbers));

	}

	public static boolean checkNumbers(int numbers) {
		int fourthNumber = numbers % 10;// 4 цифра
		int thirdNumber = (numbers /= 10) % 10;// 3 цифра
		int secondNumber = (numbers /= 10) % 10;// 2 цифра
		int firstNumber = (numbers /= 10) % 10;// 1 цифра
		int result = (secondNumber - firstNumber) / Math.abs(secondNumber - firstNumber);
		result += (thirdNumber - secondNumber) / Math.abs(thirdNumber - secondNumber);
		result += (fourthNumber - thirdNumber) / Math.abs(fourthNumber - thirdNumber);
		result /= 3;
		return result  == 1 ? true : false; 
	}

}
