package com_Epam_Pre_Training.Task3.model;

import java.util.Random;

public class Coin {
	public static int tossCoin(int quantityTosses) throws NaturalNumberException {
		validateOnNatural(quantityTosses);
		int eagles = 0;
		for (int i = 0; i < quantityTosses; i++) {
			if (new Random().nextBoolean()) {
				eagles++;
			}
		}
		return eagles;
	}

	public static void validateOnNatural(int quantityTosses) throws NaturalNumberException {
		if (quantityTosses < 1) {
			throw new NaturalNumberException("Количество бросков " + quantityTosses + "не является натуральным числом");
		}

	}
}
