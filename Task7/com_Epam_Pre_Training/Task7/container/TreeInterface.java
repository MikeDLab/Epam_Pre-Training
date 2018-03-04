package com_Epam_Pre_Training.Task7.container;

public interface TreeInterface<T> {
	public T add(T element);
	public boolean contains(T element);
	public T remove(T element);
	public void clear();
	public int size();	
}
