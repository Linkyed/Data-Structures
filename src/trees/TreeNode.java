package trees;



public class TreeNode<T extends Comparable<? super T>> {
	T element;
	TreeNode<T> leftChild = null;
	TreeNode<T> rightChild = null;
	TreeNode<T> parentNode = null;
	
	public TreeNode(T element, TreeNode<T> leftChild, TreeNode<T> rightChild, TreeNode<T> parentNode) {
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parentNode = parentNode;
	}
	
	public TreeNode(T element) {
		this.element = element;
	}

	public int compareTo(TreeNode<T> newElement) {
		if (element.compareTo(newElement.element) > 0) {
			return 1;
		}else if (element.compareTo(newElement.element) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
