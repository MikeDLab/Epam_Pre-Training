package com_Epam_Pre_Training.Task6.container;

public class Stack<T> implements StackInterface<T> {
	private final int DEFAULT_SIZE = 10;
	private int maxSize;
	Object data[];
	int size = -1;
	T Push;

	public Stack() {
		data = new Object[DEFAULT_SIZE];
		maxSize = DEFAULT_SIZE;
	}
	public Stack(int size) {
		data = new Object[size];
		maxSize = size;
	}

	public T push(T element) {
		if (size >= maxSize-1) {;
			resizeArray(maxSize +1);
		}
		data[++size] = element;
		Push = element;	
		return element;
	}

	public T pop() {
		if (size >= 0) {
			return (T) data[size--];
		}
		throw new IndexOfBoundsException();
	}

	@Override
	public T peek() {
		if (size >= 0) {
			return (T) data[size];
		}
		throw new IndexOfBoundsException();
	}

	@Override
	public int size() {
		// TODO Автоматически созданная заглушка метода
		return size+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Автоматически созданная заглушка метода
		return size == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Автоматически созданная заглушка метода
		return data.length == size+1;
	}

	private void resizeArray(int newSize) {
		Object[] newArray = new Object[newSize];
		System.arraycopy(data, 0, newArray, 0, size);
		data = newArray;
		maxSize = newSize;
	}
}
