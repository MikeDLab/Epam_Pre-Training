package com_Epam_Pre_Training.Task4.model;

public class HanoiTower {
	public static String result = "";

	private static String resolveHanoiTower(int ringsQuantity, char from, char to, char buffer)
			throws NaturalNumberException {
		Validator.validateOnNatural(ringsQuantity);
		if (ringsQuantity == 1) {
			result += from + "->" + to + "\n";
		} else {
			resolveHanoiTower(ringsQuantity - 1, from, buffer, to);
			result += from + "->" + to + "\n";
			resolveHanoiTower(ringsQuantity - 1, buffer, to, from);
		}
		return result;
	}

	public static String toStringHahoiTower(int ringsQuantity, char from, char to, char buffer)
			throws NaturalNumberException {
		return resolveHanoiTower(ringsQuantity, from, to, buffer);
	}
}
