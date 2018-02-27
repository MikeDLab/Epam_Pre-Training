package com_Epam_Pre_Training.Task6.container;

public class StaticQueue<T> extends AbstractQueue<T> implements QueueInterface<T> {
	public StaticQueue() {
		super();
	}

	public StaticQueue(int size) {
		super(size);
	}

	@Override
	public T enqueue(T element) {
		// TODO Автоматически созданная заглушка метода
		if (size <= maxSize) {
			dataArray[last++] = element;
			size++;
			return element;
		}
		throw new FullContainerException();
	}

	@Override
	public T dequeue() {
		// TODO Автоматически созданная заглушка метода
		if (size >= 0) {
			size--;
			return (T) dataArray[first++];
		}
		throw new EmptyContainerException();
	}

}
