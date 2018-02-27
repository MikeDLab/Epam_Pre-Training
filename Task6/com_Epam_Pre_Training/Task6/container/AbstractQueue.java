package com_Epam_Pre_Training.Task6.container;

public abstract class AbstractQueue<T> extends АbstractContainer<T> implements QueueInterface<T> {
	protected int last = 0;
	protected int first = 0;

	public AbstractQueue() {
		// TODO Автоматически созданная заглушка конструктора
		super();
	}

	public AbstractQueue(int size) {
		super(size);
	}

	@Override
	public T peek() {
		// TODO Автоматически созданная заглушка метода
		if (!isEmpty()) {
			return (T) dataArray[0];
		}
		throw new EmptyContainerException();
	}

	@Override
	public abstract T enqueue(T element);

	@Override
	public abstract T dequeue();

}
