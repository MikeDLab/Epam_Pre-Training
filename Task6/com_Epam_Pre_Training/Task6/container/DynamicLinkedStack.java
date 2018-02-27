package com_Epam_Pre_Training.Task6.container;

import com_Epam_Pre_Training.Task6.container.AbstractLinkedContainer.Node;

public class DynamicLinkedStack<T> extends AbstractLinkedContainer<T> implements StackInterface<T> {
	public DynamicLinkedStack() {
		// TODO Автоматически созданная заглушка конструктора
		super();
	}

	public DynamicLinkedStack(int size) {
		// TODO Автоматически созданная заглушка конструктора
		super(size);
	}

	@Override
	public T push(T element) {
		// TODO Автоматически созданная заглушка метода
		if (size != -1) {
			Node prev = last;
			last = new Node(element, null, prev);
			prev.setNext(last);
		} else {
			first = new Node(element, null, null);
			last = first;
		}
		size++;
		return element;

	}

	public T pop() {
		if (!isEmpty()) {
			T el = last.getData();
			last.setNext(null);
			last = last.getPrev();
			size--;
			return el;
		}
		throw new EmptyContainerException();
	}

	@Override
	public T peek() {
		// TODO Автоматически созданная заглушка метода
		if (!isEmpty()) {
			return last.getData();
		}
		throw new EmptyContainerException();
	}
}
