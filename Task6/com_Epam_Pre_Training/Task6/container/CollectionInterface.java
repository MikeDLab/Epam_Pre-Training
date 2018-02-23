package com_Epam_Pre_Training.Task6.container;

public interface CollectionInterface<T> {
	public T peek();
	public int size();
	public boolean isEmpty();
	public boolean isFull();
}
