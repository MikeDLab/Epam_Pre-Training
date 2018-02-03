package com.Epam_Pre_Training.task1;

public class Dragon {
	public static final double GRAMS_TO_KILOGRAMS = 1000.0;
	public static final double GRAMS_TO_TONNES = 1000000.0;

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int massInGrams = 1453452;
		double massInKg = toKilograms(massInGrams);
		double massInTonnes = toTonnes(massInGrams);
		System.out.println("Масса динозавтра в килограммах: "  + massInKg);
		System.out.println("Масса динозавтра в тоннах: "  + massInTonnes);
	}

	public static double toKilograms(int massInGrams) {
		return massInGrams / GRAMS_TO_KILOGRAMS;
	}

	public static double toTonnes(int massInGrams) {
		return massInGrams / GRAMS_TO_TONNES;
	}
}
