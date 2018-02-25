package com_Epam_Pre_Training.Task6.container;

public class DynamicStack<T> extends AbstractStack<T>  implements StackInterface<T> {
	T Push;

	public DynamicStack() {
		super();
	}

	public DynamicStack(int size) {
		super(size);
	}
	public T pop() {
		if (size >= 0) {
			T element = dataArray[size];
			T[] array = (T[]) new Object[size];
			System.arraycopy(dataArray, 0, array, 0, size);
			dataArray = array;
			size--;
			return element;
		}
		throw new IndexOfBoundsException();
	}
	public T push(T element) {
		if (size >= maxSize - 1) {
			resizeArray(maxSize + 1);
		}
		dataArray[++size] = element;
		return Push = element;
	}
}
