package com_Epam_Pre_Training.Task6.model;

import com_Epam_Pre_Training.Task6.container.Stack;

public class StringChecker {
	public static boolean isPalindrome(String str) {
		Stack<Character> symbols = new Stack<Character>(str.length());
		for (int i = 0; i < str.length() / 2; i++) {
			symbols.push(str.charAt(i));
			if (str.charAt(str.length() - 1 - i) != symbols.pop()) {
				return false;
			}
		}
		return true;
	}
}
