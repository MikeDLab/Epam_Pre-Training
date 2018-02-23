package com_Epam_Pre_Training.Task6.controller;

import java.text.StringCharacterIterator;

import com_Epam_Pre_Training.Task6.container.Queue;
import com_Epam_Pre_Training.Task6.container.Stack;
import com_Epam_Pre_Training.Task6.model.StringChecker;
import com_Epam_Pre_Training.Task6.view.View;

public class Main {

	public static void main(String[] args) {
		boolean result = StringChecker.isPalindrome("stts");
		View.view(result);
	}

}
