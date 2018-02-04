package com.Epam_Pre_Training.task6;
//Написать программу, которая находит арифметическое и геометрическое среднее цифр шестизначного числа N.
public class SixDigits {
	public static int AMOUNT_DIGITS = 6;
	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int number = 123456;
		System.out.println("Среднее арифмитическое равно: " + countAverageArithm(number));
		System.out.println("Среднее геометрическое равно: " + countAverageGeom(number));
	}
	public static double countAverageArithm(int number)
	{
		double sum = number % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		sum += (number /= 10) % 10;
		return sum / AMOUNT_DIGITS;
	}
	public static double countAverageGeom(int number)
	{
		double comp =Math.log(number % 10 );
		comp += Math.log((number /= 10) % 10);
		comp += Math.log((number /= 10) % 10);
		comp +=Math.log((number /= 10) % 10);
		comp += Math.log((number /= 10) % 10);
		comp += Math.log((number /= 10) % 10);
		return Math.exp(comp / AMOUNT_DIGITS);
	}

}
