package com_Epam_Pre_Training_Task2_4;

public class NextDay {
	public static int[] MonthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		int day = 31;
		int month = 12;
		int year = 1992;
		viewNextDay(day, month, year);
	}

	public static void viewNextDay(int day, int month, int year) {
		System.out.println(indentifyTomorrowDay(day, month, year));
		System.out.println(indentifyTormorrowMonth(day, month, year));
		System.out.println(indentifyTormorrowYear(day, month, year));
	}

	public static int indentifyTomorrowDay(int day, int month, int year) {
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
			return ++day;
		} else {
			return 1;
		}
	}

	public static int indentifyTormorrowMonth(int day, int month, int year) {
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
			return month;
		} else if (month != 12) {
			return ++month;
		} else {
			return 1;
		}
	}

	public static int indentifyTormorrowYear(int day, int month, int year) {
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
			return year;
		} else if (month != 12) {
			return year;
		} else {
			return ++year;
		}
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
	}
}