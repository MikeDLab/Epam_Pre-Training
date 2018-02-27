package com_Epam_Pre_Training.Task6.container;

public class StaticStack<T> extends AbstractStack<T> implements StackInterface<T> {
	private T Push;

	public StaticStack() {
		super();
	}
	public StaticStack(int size) {
		super(size);
	}
	public T pop() {
		if (size >= 0) {
			return (T) dataArray[size--];
		}
		throw new EmptyContainerException();
	}
	public T push(T element) {
		if (size <= maxSize) {
			dataArray[++size] = element;
			return Push = element;
		}
		throw new FullContainerException();
	}
}
