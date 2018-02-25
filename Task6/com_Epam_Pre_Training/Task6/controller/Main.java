package com_Epam_Pre_Training.Task6.controller;

import com_Epam_Pre_Training.Task6.container.DynamicStack;
import com_Epam_Pre_Training.Task6.container.StaticQueue;
import com_Epam_Pre_Training.Task6.container.DynamicQueue;
import com_Epam_Pre_Training.Task6.container.StaticStack;
import com_Epam_Pre_Training.Task6.model.StringChecker;
import com_Epam_Pre_Training.Task6.view.View;

public class Main {

	public static void main(String[] args) {
		String str = "stts";
		executeTask(str);
		String str1 = "strs";
		executeTask(str1);
		}
	public static void executeTask(String str)
	{
		boolean result = StringChecker.isPalindrome(str);
		View.view(result);
	}

}
