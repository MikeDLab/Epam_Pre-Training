package com_Epam_Pre_Training_Task2_4.controller;

import com_Epam_Pre_Training_Task2_4.model.NextDay;
import com_Epam_Pre_Training_Task2_4.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int day = 31;
		int month = 12;
		int year = 1992;
		int nextDay = NextDay.indentifyTomorrowDay(day, month, year);
		int nextMonth = NextDay.indentifyTormorrowMonth(day, month, year);
		int nextYear = NextDay.indentifyTormorrowYear(day, month, year);
		View.printNextDate(nextYear, nextMonth, nextDay);
	}

}
