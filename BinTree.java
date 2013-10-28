class BinTree {
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	
	class Node {
		public char value;
		public Node left;
		public Node right;
		
		public Node(char value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	public BinTree() {
		Node node1 = new Node('A', null, null);
		Node node21 = new Node('C', null, null);
		Node node22 = new Node('D', null, null);
		Node node2 = new Node('B', node21, node22);
		this.root = new Node('R', node1, node2);
	}
	
	public void inOrder(Node node) {
		if (node == null) {
			return ;
		}
		
		if (node.left != null) {
			inOrder(node.left);
		}
		
		System.out.println(node.value);
		
		if (node.right != null) {
			inOrder(node.right);
		}
	}
	
	public static void main(String argv[]) {
		BinTree binTree = new BinTree();
		binTree.inOrder(binTree.getRoot());
	}
}