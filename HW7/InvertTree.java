public class InvertTree
{
     public class Node{
        int val;
        Node left;
        Node right;
        Node(int x) { val = x; }
     
    }
    public Node invertTree(Node root){
    if (root != null){
        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
    }
    return root;
    }

}