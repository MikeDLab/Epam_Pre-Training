package com_Epam_Pre_Training_Task2_1;

public class Dragon {
	public static int HEADS_AT_BIRTH = 3;
	public static int EYES_AT_HEAD = 2;
	public static int HEADS_AFTER_200_YEARS = 2;
	public static int HEADS_AFTER_300_YEARS = 1;
	public static int HEADS_BEFORE_200_YEARS = 3;
	public static int YEARS_3_HEADS_PER_YEAR = 200;
	public static int YEARS_2_HEADS_PER_YEAR = 100;

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int dragonAge = 30;
		int heads = countHeads(dragonAge);
		int eyes = countEyes(heads);
		System.out.println("У дракона " + heads + " голов и " + eyes + " глаз");
	}

	public static int countHeads(int dragonAge) {
		int _heads = HEADS_AT_BIRTH;
		if (dragonAge > 300) {
			_heads += HEADS_BEFORE_200_YEARS * YEARS_3_HEADS_PER_YEAR + HEADS_AFTER_200_YEARS * YEARS_2_HEADS_PER_YEAR
					+ (dragonAge - YEARS_3_HEADS_PER_YEAR - YEARS_2_HEADS_PER_YEAR) * HEADS_AFTER_300_YEARS;
		} else if (dragonAge > 200) {
			_heads += HEADS_BEFORE_200_YEARS * YEARS_3_HEADS_PER_YEAR
					+ HEADS_AFTER_200_YEARS * (dragonAge - YEARS_3_HEADS_PER_YEAR);
		} else {
			_heads += HEADS_BEFORE_200_YEARS * dragonAge;
		}
		return _heads;
	}

	public static int countEyes(int heads) {
		return heads * EYES_AT_HEAD;
	}

}
