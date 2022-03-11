/**
 *
 * @author dylan
 */

    // #1: A
    // #2: D, E, F
    // #3: D, E, B, F, C, A
    // #4: A, B, D, E, C, F
    // #5: D, B, E, A, F, C

class Node { 
	char data; 
	Node left, right; 

	Node(char item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTreeBasic { 
	Node root; 
	static int preIndex = 0; 

	Node buildTree(char in[], char pre[], int start, int end) 
	{ 
		if (start > end) 
			return null; 

		Node tNode = new Node(pre[preIndex++]); 
		if (start == end) 
			return tNode; 
		int inIndex = search(in, start, end, tNode.data); 
		tNode.left = buildTree(in, pre, start, inIndex - 1); 
		tNode.right = buildTree(in, pre, inIndex + 1, end); 

		return tNode; 
	} 

	int search(char arr[], int strt, int end, char value) 
	{ 
		int i; 
		for (i = strt; i <= end; i++) { 
			if (arr[i] == value) 
				return i; 
		} 
		return i; 
	} 

	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 
		printInorder(node.left); 
		System.out.print(node.data + " "); 
		printInorder(node.right); 
	} 

	public static void main(String args[]) 
	{ 
		BinaryTreeBasic tree = new BinaryTreeBasic(); 
		char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' }; 
		char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' }; 
		int len = in.length; 
		Node root = tree.buildTree(in, pre, 0, len - 1); 
		System.out.print("Inorder traversal : "); 
		tree.printInorder(root); 
	} 
} 
