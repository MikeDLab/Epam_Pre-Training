package com_Epam_Pre_Training.Task5.container;

public class ArrayList<T> implements ContainerInterface<T> {
	int DEFAULT_CAPACITY = 0;
	private T[] arrayList;
	int size;

	public ArrayList() {
		this.arrayList = (T[]) new Object[DEFAULT_CAPACITY];
		size = DEFAULT_CAPACITY;
	}

	public ArrayList(int capacity) {
		if (capacity < 0) {
			throw new ImpossibleArraySize();
		} else {
			this.arrayList = (T[]) new Object[capacity];
			size = capacity;
		}

	}

	private void resizeArray(int newSize) {
		T[] newArray = (T[]) new Object[newSize];
		System.arraycopy(arrayList, 0, newArray, 0, size);
		arrayList = newArray;
		size = newSize;
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
	public boolean contains(Object o) {
		// TODO Автоматически созданная заглушка метода
		return indexOf(o) >= 0;
	}

	public boolean remove(Object o) {
		// TODO Автоматически созданная заглушка метода
		if (o != null) {
			for (int i = 0; i < size; i++) {
				if (o.equals(arrayList[i])) {
					remove(i);
					return true;
				}
			}
		}
		return false;
	}

	public void clear() {
		// TODO Автоматически созданная заглушка метода
		for (int i = 0; i < size; i++) {
			arrayList[i] = null;
		}
		size = 0;
	}

	public T get(int index) {
		if (index < size) {
			return (T) arrayList[index];
		}
		throw new IndexOfBoundException();
	}

	public T set(int index, T element) {
		// TODO Автоматически созданная заглушка метода
		if (index < size) {
			return (T) (arrayList[index] = element);
		}
		throw new IndexOfBoundException();
	}

	public void add(int index, T element) {
		// TODO Автоматически созданная заглушка метода
		if (index < size - 1) {
			resizeArray(size + 1);
			for (int i = index + 1; i < size; i++) {
				arrayList[i] = arrayList[i - 1];
			}
			arrayList[index] = element;
		} else {
			resizeArray(size + 1);
			arrayList[size - 1] = element;
		}
	}

	public T remove(int index) {
		// TODO Автоматически созданная заглушка метода
		if (index <= size) {
			int numMoved = size - index - 1;
			T removedValue = (T) arrayList[index];
			System.arraycopy(arrayList, index + 1, arrayList, index, numMoved);
			arrayList[--size] = null;
			return removedValue;
		}
		throw new IndexOfBoundException();
	}

	@Override
	public int indexOf(Object o) {
		// TODO Автоматически созданная заглушка метода
		for (int i = 0; i < size; i++) {
			if (o.equals(arrayList[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public T add(T element) {
		// TODO Автоматически созданная заглушка метода
		resizeArray(size + 1);
		arrayList[size - 1] = element;
		return element;
	}

	public void add(T... elements) {
		// TODO Автоматически созданная заглушка метода
		for (int i = 0; i < elements.length; i++) {
			resizeArray(size + 1);
			arrayList[size - 1] = elements[i];
		}
	}

}
