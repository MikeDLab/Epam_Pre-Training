package com_Epam_Pre_Training.Task6.container;

public class DynamicQueue<T> extends AbstractQueue<T> implements QueueInterface<T> {
	public DynamicQueue() {
		dataArray = (T[]) new Object[DEFAULT_SIZE];
		maxSize = DEFAULT_SIZE;
	}

	public DynamicQueue(int size) {
		dataArray = (T[]) new Object[size];
		maxSize = size;
	}

	@Override
	public T enqueue(T element) {
		// TODO Автоматически созданная заглушка метода
		if (size > maxSize) {
			resizeArray(maxSize + 1);
		}
		dataArray[last++] = element;
		size++;
		return element;
	}

	@Override
	public T dequeue() {
		// TODO Автоматически созданная заглушка метода
		if (size >= 0) {
			T element = (T) dataArray[first];
			T[] array = (T[]) new Object[size];
			System.arraycopy(dataArray, first+1, array, 0, size);
			dataArray = array;
			size--;
			return element;
		}
		throw new IndexOfBoundsException();
	}


}
