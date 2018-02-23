package com_Epam_Pre_Training.Task6.container;

public interface StackInterface<T> extends CollectionInterface<T> {
	public T push(T element);
	public T pop();
}
