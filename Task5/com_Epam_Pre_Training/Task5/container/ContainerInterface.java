package com_Epam_Pre_Training.Task5.container;

public interface ContainerInterface<T> {
	public T add(T element);
	public int size();
	public boolean isEmpty();
	public void clear();
	public int indexOf(T o);
	public T get(int index);
	boolean contains(Object o);
}
