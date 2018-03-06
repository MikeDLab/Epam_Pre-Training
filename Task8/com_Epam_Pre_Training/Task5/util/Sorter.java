package com_Epam_Pre_Training.Task5.util;

import java.lang.reflect.Array;

public enum Sorter {
	SORTER;
	public <T extends Comparable<? super T>> void bubleSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T buffer = array[j];
					array[j] = array[j + 1];
					array[j + 1] = buffer;
				}
			}
		}
	}

	public <T extends Comparable<? super T>> void insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			T x = array[i];
			int j = i;
			while (j > 0 && array[j - 1].compareTo(x) > 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = x;
		}
	}

	public <T extends Comparable<? super T>> void selectionSort(T array[]) {
		for (int i = 0; i < array.length; i++) {
			int k = i;
			T x = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(x) < 0) {
					k = j;
					x = array[k];
				}

			}
			array[k] = array[i];
			array[i] = x;
		}
	}

	public <T extends Comparable<? super T>> void mergeSort(T[] array) {
		doMergeSort(array, 0, array.length - 1);
	}

	public <T extends Comparable<? super T>> void doMergeSort(T[] array, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			doMergeSort(array, lowIndex, midIndex);
			doMergeSort(array, midIndex + 1, highIndex);
			merge(array, lowIndex, midIndex, highIndex);
		}
	}

	private <T extends Comparable<? super T>> void merge(T[] array, int low, int middle, int high) {
		T[] buffer = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
		for (int i = low; i <= high; i++) {
			buffer[i] = array[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (buffer[i].compareTo(buffer[j]) <= 0) {
				array[k] = buffer[i];
				i++;
			} else {
				array[k] = buffer[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = buffer[i];
			k++;
			i++;
		}
	}

	public <T extends Comparable<? super T>> void quickSort(T[] array) {
		doQuickSort(array, 0, array.length - 1);
	}

	private static <T extends Comparable<? super T>> void doQuickSort(T[] array, int start, int end) {
		if (start >= end)
			return;
		int i = start, j = end;
		int cur = i - (i - j) / 2;
		while (i < j) {
			while (i < cur && (array[i].compareTo(array[cur]) <= 0)) {
				i++;
			}
			while (j > cur && (array[cur].compareTo(array[j]) <= 0)) {
				j--;
			}
			if (i < j) {
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				if (i == cur)
					cur = j;
				else if (j == cur)
					cur = i;
			}
		}
		doQuickSort(array, start, cur);
		doQuickSort(array, cur + 1, end);
	}
}
