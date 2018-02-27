package com_Epam_Pre_Training.Task6.container;

public abstract class AbstractLinkedContainer<T> extends АbstractContainer<T> implements CollectionInterface<T> {
	protected final int DEFAULT_MAX_SIZE = 10;
	protected Node first;
	protected Node last;
	public AbstractLinkedContainer()
	{
		super();
	}
	public AbstractLinkedContainer(int size)
	{
		super(size);
	}
	class Node {
		private T o;
		private Node next;
		private Node prev;

		private Node() {

		}

		public Node(T o, Node next, Node prev) {
			this.o = o;
			this.next = next;
			this.prev = prev;
		}

		public void setNext(Node next) {
			this.next = next;

		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public T getData() {
			return o;
		}

		public Node getPrev() {
			return prev;
		}

		public Node getNext() {
			return next;
		}
		public void setPrevN()
		{
			this.prev = null;
		}
	}

	@Override
	public abstract T peek();
	

}
