package com_Epam_Pre_Training.Task7.container;

public class BinaryTree<T extends Comparable<? super T>> implements TreeInterface<T> {
	protected int size = -1;
	protected Node root;

	public class Node {
		protected Node left;
		protected Node right;
		protected T value;

		public Node(T value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}

	}

	public BinaryTree() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public BinaryTree(T... element) {
		// TODO Автоматически созданная заглушка конструктора
		for (int i = 0; i < element.length; i++) {
			add(element[i]);
		}
	}

	@Override
	public T add(T element) {
		// TODO Автоматически созданная заглушка метода
		if (root == null) {
			root = new Node(element);
		} else {
			addTo(root, element);
		}
		size++;
		return element;
	}

	private void addTo(Node node, T value) {
		if (value.compareTo(node.getValue()) < 0) {
			if (node.getLeft() == null) {
				node.setLeft(new Node(value));
			} else {
				addTo(node.getLeft(), value);
			}
		} else {
			if (node.getRight() == null) {
				node.setRight(new Node(value));
			} else {
				addTo(node.getRight(), value);
			}
		}
	}

	@Override
	public boolean contains(T element) {
		// TODO Автоматически созданная заглушка метода
		Node current = root;
		int result;
		while (current != null) {
			result = element.compareTo(current.getValue());
			if (result == 0) {
				return true;
			} else if (result < 0) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}
		return false;
	}

	@Override
	public T remove(T element) {
		// TODO Автоматически созданная заглушка метода
		Node current = root;
		Node res = removeFrom(current, element);
		size--;
		return element;
	}

	private Node removeFrom(Node node, T element) {
		if (node != null) {
			if (element.compareTo(node.getValue()) == 0) {
				// если нет обоих потомков
				if (node.getRight() == null && node.getLeft() == null) {
					node = null;
				} else {
					// есть только 1 потомок
					if (node.getRight() == null || node.getLeft() == null) {
						if (node.getRight() == null) {
							node = node.getLeft();
						} else {
							node = node.getRight();
						}
					} else {
						// если оба есть
						if (node.getRight() != null && node.getLeft() != null) {
							// если у правого потомка нет левого потомка
							if (node.getRight().getLeft() == null) {
								node.setValue(node.getRight().getValue());
								node.setRight(node.getRight().getRight());
							} else {
								// если есть левый потомок
								Node min = findMinElement(node.getRight());
								node.setValue(min.getValue());
								removeFrom(node.getRight(), min.getValue());
							}

						}
					}

				}
				return node;
			}

		} else {
			throw new NoElementException();
		}
		if (element.compareTo(node.getValue()) < 0) {
			node.setLeft(removeFrom(node.getLeft(), element));
			return node;
		}
		node.setRight(removeFrom(node.getRight(), element));
		return node;

	}

	private Node findMinElement(Node root) {
		return root.getLeft() == null ? root : findMinElement(root.getLeft());
	}

	@Override
	public void clear() {
		// TODO Автоматически созданная заглушка метода
		root = null;
		size = -1;
	}

	@Override
	public int size() {
		// TODO Автоматически созданная заглушка метода
		return size + 1;
	}

	public StringBuilder traversePreOrder() {
		if (root == null) {
			throw new NoElementException();
		}
		return preOder(root, new StringBuilder());
	}

	private StringBuilder preOder(Node root, StringBuilder result) {
		if (root != null) {
			result.append(root.getValue() + " ");
			preOder(root.getLeft(), result);
			preOder(root.getRight(), result);
		}
		return result;
	}

	public StringBuilder traversePostOrder() {
		if (root == null) {
			throw new NoElementException();
		}
		return postOder(root, new StringBuilder());
	}

	private StringBuilder postOder(Node root, StringBuilder result) {
		if (root != null) {
			postOder(root.getLeft(), result);
			postOder(root.getRight(), result);
			result.append(root.getValue() + " ");

		}
		return result;
	}

	public StringBuilder traverseInOrder() {
		if (root == null) {
			throw new NoElementException();
		}
		return inOder(root, new StringBuilder());
	}

	private StringBuilder inOder(Node root, StringBuilder result) {
		if (root != null) {
			inOder(root.getLeft(), result);
			result.append(root.getValue() + " ");
			inOder(root.getRight(), result);
		}
		return result;
	}

}
