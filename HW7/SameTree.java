public class SameTree
{
    public class Node{
        int val;
        Node left;
        Node right;
        Node(int x) { val = x; }
     
    }
  public boolean isSameTree(Node p, Node q) {
    if (p == null && q == null) return true;
    if (q == null || p == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
  }
}