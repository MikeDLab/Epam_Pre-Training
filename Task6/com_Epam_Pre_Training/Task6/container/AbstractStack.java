package com_Epam_Pre_Training.Task6.container;

public abstract class AbstractStack<T> extends АbstractContainer<T> implements StackInterface<T> {
	protected T Push;
	protected AbstractStack() {
		// TODO Автоматически созданная заглушка конструктора
		super();
	}
	protected AbstractStack(int size)
	{
		super(size);
	}

	@Override
	public abstract T pop();

	@Override
	public T peek() {
		// TODO Автоматически созданная заглушка метода
		if (!isEmpty()) {
			return (T) dataArray[size];
		}
		throw new EmptyContainerException();
	}

}
