package com_Epam_Pre_Training.Task6.container;

import com_Epam_Pre_Training.Task6.container.AbstractLinkedContainer.Node;

public class DynamicLinkedQueue<T> extends AbstractLinkedContainer<T> implements QueueInterface<T> {
	public DynamicLinkedQueue() {
		// TODO Автоматически созданная заглушка конструктора
		super();
	}

	public DynamicLinkedQueue(int size) {
		// TODO Автоматически созданная заглушка конструктора
		super(size);
	}

	@Override
	public T enqueue(T element) {
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

	public T dequeue() {
		T el = first.getData();
		if (size > 0) {
			first = first.getNext();
			first.setPrev(null);
		} else {
			first = null;
		}
		size--;
		return el;
	}

	@Override
	public T peek() {
		// TODO Автоматически созданная заглушка метода
		if (!isEmpty()) {
			return first.getData();
		}
		throw new EmptyContainerException();
	}

}
