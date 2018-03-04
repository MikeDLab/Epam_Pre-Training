package com_Epam_Pre_Training.Task7.controller;

import com_Epam_Pre_Training.Task7.container.BinaryTree;
import com_Epam_Pre_Training.Task7.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		executeTask();

	}

	public static void executeTask() {
		BinaryTree<Integer> tree = new BinaryTree<>(10, 5, 35, 1, 4, 20, 31, 17);
		View.view(tree.traverseInOrder());
		View.view(tree.traversePostOrder());
		View.view(tree.traversePreOrder());
		View.view(tree.traversePreOrder());
	}

}
