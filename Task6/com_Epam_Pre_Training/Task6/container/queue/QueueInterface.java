package com_Epam_Pre_Training.Task6.container.queue;

import com_Epam_Pre_Training.Task6.container.CollectionInterface;

public interface QueueInterface<T> extends CollectionInterface<T>{
	public T enqueue(T element);
	public T dequeue();
}
