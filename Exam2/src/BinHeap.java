/**
 *
 * @author dylan
 */
public class BinHeap{ 

    public static class Node{ 
        int data; 
        Node left, right; 
        Node(int data) 
        { 
            this.data = data; 
            left = right = null; 
        } 
    } 
  
    public static void findParentValue(int value, Node node, int parent) 
    { 
        if (node == null) 
            return; 
  
        if (node.data == value){ 
            System.out.println(parent); 
        } 
        else{ 
            findParentValue(value, node.left,  node.data); 
            findParentValue(value, node.right,  node.data);
            System.out.println(parent);
            return;
        } 
    } 

    public static void main(String []args){ 
        Node root = new Node(3); 
        root.left = new Node(10); 
        root.right = new Node(4); 
        root.left.left = new Node(11); 
        root.left.right = new Node(12);
        root.left.left.left = new Node(15);
        root.left.left.right = new Node(30);
        root.right.left = new Node(6);
        root.right.right = new Node(9); 
        findParentValue(3, root, -1); 
    } 
} 
