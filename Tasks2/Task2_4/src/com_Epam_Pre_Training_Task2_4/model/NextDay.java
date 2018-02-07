package com_Epam_Pre_Training_Task2_4.model;

public class NextDay {
	public static int[] MonthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int indentifyTomorrowDay(int day, int month, int year) {
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
			return ++day;
		} else {
			return 1;
		}
	}

	public static int indentifyTormorrowMonth(int day, int month, int year) {
		int nextMonth = month;
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
		} else if (month != 12) {
			nextMonth++;
		} else {
			nextMonth = 1;
		}
		return nextMonth;
	}

	public static int indentifyTormorrowYear(int day, int month, int year) {
		int nextYear = year;
		MonthDays[1] = isLeapYear(year) ? 29 : 28;
		if (MonthDays[month - 1] != day) {
		} else if (month != 12) {
		} else {
			return ++year;
		}
		return nextYear;
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}