package com_Epam_Pre_Training.Task6.container;

public abstract class АbstractContainer<T> implements CollectionInterface<T>{
	protected final int DEFAULT_SIZE=10;
	protected  T dataArray[];
	protected int maxSize;
	protected int size=-1;
	public АbstractContainer() {
		// TODO Автоматически созданная заглушка конструктора
		this.dataArray = (T[]) new Object[DEFAULT_SIZE];
		maxSize = DEFAULT_SIZE;
	}
	public АbstractContainer(int size) {
		// TODO Автоматически созданная заглушка конструктора
		this.dataArray = (T[]) new Object[size];
		this.maxSize = size;
	}
	@Override
	public abstract T peek();

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
		return size+1 == maxSize;
	}
	protected void resizeArray(int newSize) {
		Object[] newArray = new Object[newSize];
		System.arraycopy(dataArray, 0, newArray, 0, size);
		dataArray = (T[]) newArray;
		maxSize = newSize;
	}

}
