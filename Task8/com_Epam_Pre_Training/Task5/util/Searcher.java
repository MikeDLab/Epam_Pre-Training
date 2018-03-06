package com_Epam_Pre_Training.Task5.util;

public enum Searcher {
	// public static final Searcher sorter = new Searcher();
	SEARCHER;
	public <T extends Comparable<? super T>> int linearSearch(T array[], T key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public <T extends Comparable<? super T>> int binarySearch(T array[], T key) {

		int left = 0;
		int right = array.length;
		int middle;
		while (left < right) {
			middle = (right + left) / 2;
			if (array[middle].compareTo(key) == 0) {
				return middle;
			} else {
				if (array[middle].compareTo(key) < 0) {
					left = middle + 1;
				} else {
					right = middle;
				}
			}
		}
		return -1;
	}

	public <T extends Comparable<? super T>> int binaryRecursiveSearch(T array[], T key) {
		return doBinary(array, key, 0, array.length);
	}

	private <T extends Comparable<? super T>> int doBinary(T array[], T key, int left, int right) {
		int middle = (right + left) / 2;
		if(left >=right)
		{
			return -1;
		}
		if (array[middle].compareTo(key) == 0) {
			return middle;
		} else {
			
			if (array[middle].compareTo(key) < 0) {
				return doBinary(array, key, middle + 1, right);
			} else {
				return doBinary(array, key, left, middle);
			}
		}
		
	}

}
