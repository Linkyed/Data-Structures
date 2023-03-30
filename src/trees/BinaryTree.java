package trees;

import utility.UsefulFunctions;

public class BinaryTree<T extends Comparable<? super T>> extends UsefulFunctions{
	
	TreeNode<T> root = null;
	int sizeOf = 0;
	
	public void add(T element) {
		TreeNode<T> node = new TreeNode<T>(element);
		if (root == null) {
			root = node;
		} else {
			adding(this.root, node);
		}
	}
	
	private void adding(TreeNode<T> currentElement, TreeNode<T> newElement){
		if (currentElement.compareTo(newElement) > 0) {
            if (isNull.test(currentElement.leftChild)) {
                currentElement.leftChild = newElement;
                return;
            }
            adding(currentElement.leftChild, newElement);
        } else if (currentElement.compareTo(newElement) < 0) {
            if (isNull.test(currentElement.rightChild)) {
                currentElement.rightChild = newElement;
                return;
            }
            adding(currentElement.rightChild, newElement);
        } else {
            throw new IllegalArgumentException();
        }
		sizeOf++;
	}
	
	public void showBinaryTree() {
		if (isNull.test(root)) return;
		System.out.println("RootNode: " + root.element);
		showBinaryTreeRecrusive("LeftNode: ", root.leftChild);
		showBinaryTreeRecrusive("RightNode: ", root.rightChild);
	}
	
	private void showBinaryTreeRecrusive(String text, TreeNode<T> node) {
		if (isNull.test(node)) return;
		System.out.println(text + node.element);
		showBinaryTreeRecrusive("LeftNode: ", node.leftChild);
		showBinaryTreeRecrusive("RightNode: ", node.rightChild);
	}
}
