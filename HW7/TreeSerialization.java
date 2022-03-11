import java.util.*;

public class TreeSerialization
{
   public class Node{
        int val;
        Node left;
        Node right;
        Node(int x) { val = x; }
     
   }
    // Encodes a tree to a single string.
   public String serialize(Node root) 
{
    if(root == null) return "#";
    
    return "" + root.val + " " + serialize(root.left) + " " + serialize(root.right);
}

// Decodes your encoded data to tree.
public Node deserialize(String data) 
{
    return build(new Scanner(data));
}

private Node build(Scanner sc)
{
    if(!sc.hasNext()) return null;
    String tk = sc.next();
    if(tk.equals("#")) return null;
    
    Node root = new Node(Integer.parseInt(tk));
    root.left = build(sc);
    root.right = build(sc);
    
    return root;
}

}
