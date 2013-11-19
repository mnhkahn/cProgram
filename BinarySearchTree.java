
public class BinarySearchTree<T extends Comparable<? super T>> {
	private static class BinaryNode<T> {
		BinaryNode(T element) {
			this(element, null, null);
		}
		BinaryNode(T element, BinaryNode<T> left, BinaryNode<T> right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
		T element;
		BinaryNode<T> left;
		BinaryNode<T> right;
	}
	
	private BinaryNode<T> root;
	private int count;
	
	public BinarySearchTree() {
		root = null;
		count = 0;
	}
	public void add(T value) {
		add(value, root);
	}
	public BinaryNode<T> add(T value, BinaryNode<T> t) {
		if (t == null) {
			count++;
			return new BinaryNode<T>(value) ;
		}
		
		int compareResult = value.compareTo(this.root.element);
		if (compareResult > 0) {
			t.right = add(value, t.right);
		}
		else if (compareResult < 0) {
			t.left = add(value, t.left);
		}
		return t;
	}
	public void remove(T value) {
		remove(value, root);
		count--;
	}
	public BinaryNode<T> remove(T value, BinaryNode<T> t) {
		if (t == null) {
			return t;
		}
		
		int compareResult = value.compareTo(this.root.element);
		if (compareResult > 0) {
			t.right = remove(value, t.right);
		}
		else if (compareResult < 0) {
			t.left = remove(value, t.left);
		}
		else if (t.left != null && t.right != null) {
			t.element = findMin(t.right).element;
			remove(t.element, t.right);
		}
		else {
			t = (t.right != null) ? t.left : t.right;
			count--;
		}

		return t;
	}
	public boolean find(T value) {
		return find(value, root);
	}
	public boolean find(T value, BinaryNode<T> t) {
		if (t == null)
			return false;
		
		int compareResult = value.compareTo(this.root.element);
		if (compareResult > 0) {
			return find(value, this.root.right);
		}
		else if (compareResult < 0) {
			return find(value, this.root.left);
		}
		else {
			return true;
		}
	}
	public BinaryNode<T> findMin(BinaryNode<T> t) {
		if (t == null) {
			return null;
		}
		if (t.left == null) {
			return t;
		}
		return findMin(t.left);
	}
	public int size() {
		return count;
	}
	
}