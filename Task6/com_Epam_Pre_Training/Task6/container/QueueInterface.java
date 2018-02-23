package com_Epam_Pre_Training.Task6.container;

public interface QueueInterface<T> extends CollectionInterface<T>{
	public T enqueue(T element);
	public T dequeue();
}
