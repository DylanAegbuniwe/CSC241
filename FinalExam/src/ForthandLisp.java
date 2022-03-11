import java.util.*;
/**
 *
 * @author dylan
 * To create the FORTH sequence, you have to output the AST in preorder sequence.
 */
public class ForthandLisp {
    Node head;
    
    public class Node{
        public String val;
        public Node left;
        public Node right;
        
        Node (String val){
            this.val = val;
            right = null;
            left = null;           
        }
    }
    
    void push(String num) { 
        Node new_node = new Node(num);   
        if (num.equals("+")){
            System.out.println("3");
        } else{
            new_node.left = head;
            head = new_node;
        }
        
        
    } 
    public static void main(String[] args){
        ForthandLisp stacked = new ForthandLisp();
        stacked.push("1");
        stacked.push("2");
        stacked.push("+");
    }
}
