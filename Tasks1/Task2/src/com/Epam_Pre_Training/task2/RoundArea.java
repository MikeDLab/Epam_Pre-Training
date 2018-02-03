package com.Epam_Pre_Training.task2;

//На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). 
//Разработайте программу нахождения площади кольца, внешний радиус кото- рого равен R1, а внутренний радиус равен R2.
public class RoundArea {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		double radius1 = 3;//радиус первого круга
		double radius2 = 1;//радиус второго круга
		double roundArea = Math.abs(countCircleArea(radius1) - countCircleArea(radius2));
		System.out.println("Площадь кольца равна: " + roundArea);
	}

	public static double countCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}
