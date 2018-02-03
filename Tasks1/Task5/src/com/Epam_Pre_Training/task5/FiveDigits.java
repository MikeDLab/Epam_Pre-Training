package com.Epam_Pre_Training.task5;

//Написатьпрограмму,которая находит сумму и произведение цифр пятизначного числа N.
public class FiveDigits {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int number = 12345;
		System.out.println(countSum(number));
		System.out.println(countComp(number));
	}

	public static int countSum(int number) {
		int sum = number % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		return sum;
	}

	public static int countComp(int number) {
		int comp = number % 10;
		comp *= (number /= 10) % 10;
		comp *= (number /= 10) % 10;
		comp *= (number /= 10) % 10;
		comp *= (number /= 10) % 10;
		return comp;
	}
}
