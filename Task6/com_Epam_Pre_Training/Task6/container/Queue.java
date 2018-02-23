package com_Epam_Pre_Training.Task6.container;

public class Queue<T> implements QueueInterface<T> {
	private final int DEFAULT_SIZE = 10;
	private int maxSize;
	private Object data[];
	private int size = 0;
	private int first = 0;
	private int last = 0;

	public Queue() {
		data = new Object[DEFAULT_SIZE];
		maxSize = DEFAULT_SIZE;
	}

	public Queue(int size) {
		data = new Object[size];
		maxSize = size;
	}

	@Override
	public T peek() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public int size() {
		// TODO Автоматически созданная заглушка метода
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Автоматически созданная заглушка метода
		return size == 0;

	}

	@Override
	public boolean isFull() {
		// TODO Автоматически созданная заглушка метода
		System.out.println(data.length);
		return data.length == size;
	}

	@Override
	public T enqueue(T element) {
		// TODO Автоматически созданная заглушка метода
		if (size > maxSize ) {
			resizeArray(maxSize + 1);
		}
		data[last++] = element;
		size++;
		return element;
	}

	@Override
	public T dequeue() {
		// TODO Автоматически созданная заглушка метода
		if (size >= 0) {
			size--;
			return (T) data[first++];
		}
		throw new IndexOfBoundsException();
	}

	private void resizeArray(int newSize) {
		Object[] newArray = new Object[newSize];
		System.arraycopy(data, 0, newArray, 0, size);
		data = newArray;
		maxSize = newSize;
	}

}
