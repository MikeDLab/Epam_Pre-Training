package com_Epam_Pre_Training.Task5.Model.container;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<T> implements List<T> {
	int DEFAULT_CAPACITY = 0;
	private Object[] arrayList;
	int size;

	public ArrayList() {
		this.arrayList = new Object[DEFAULT_CAPACITY];
		size = DEFAULT_CAPACITY;
	}

	public ArrayList(int capacity) throws ImpossibleArraySize {
		if (capacity < 0) {
			throw new ImpossibleArraySize("Невозможный размер массива");
		} else {
			this.arrayList = new Object[capacity];
			size = capacity;
		}

	}

	private void checkIndex(int index) throws IndexOfBoundsException {
		if (index >= size) {
			throw new IndexOfBoundsException();
		}
	}

	private void resizeArray(int newSize) {
		Object[] newArray = new Object[newSize];
		System.arraycopy(arrayList, 0, newArray, 0, size);
		arrayList = newArray;
		size = newSize;
	}

	boolean ensureCapacity(int addsize) {
		return size > addsize;
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

	@Override
	public Iterator<T> iterator() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Автоматически созданная заглушка метода
		return Arrays.copyOf(arrayList, size);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Автоматически созданная заглушка метода
		resizeArray(size + 1);
		arrayList[size - 1] = e;
		return true;
	}

	@Override
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

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public void clear() {
		// TODO Автоматически созданная заглушка метода
		for (int i = 0; i < size; i++) {
			arrayList[i] = null;
		}
		size = 0;
	}

	@Override
	public T get(int index) {
		return (T) arrayList[index];
	}
	@Override
	public T set(int index, T element) {
		// TODO Автоматически созданная заглушка метода
		try {
			checkIndex(index);
			arrayList[index] = element;
		} catch (IndexOfBoundsException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		}
		return null;
	}

	@Override
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

	@Override
	public T remove(int index) {
		// TODO Автоматически созданная заглушка метода
		try {
			checkIndex(index);
		} catch (IndexOfBoundsException e) {
			// TODO Автоматически созданный блок catch
			return null;
		}
		int numMoved = size - index - 1;
		T removedValue = (T) arrayList[index];
		System.arraycopy(arrayList, index + 1, arrayList, index, numMoved);
		arrayList[--size] = null;
		return removedValue;
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
	public int lastIndexOf(Object o) {
		// TODO Автоматически созданная заглушка метода
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

}
