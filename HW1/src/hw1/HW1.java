package hw1;

/**
 *
 * @author dylan
 */
import java.util.*;

public class HW1 {

 public static class Node {
        int data;
        Node next;
        Node(int d) {data = d;}
    }
   
 public static class LinkedList{
     Node head;
 }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.head = new Node(2);
        l1.head.next = new Node(3);
        l1.head.next.next = new Node(1);
        
        LinkedList l2 = new LinkedList();
        l2.head = new Node(4);
        l2.head.next = new Node (5);
        
        concatenate(l1.head, l2.head);
    }
    
    public static void concatenate(Node l1, Node l2){
       Node head = new Node(0);
       Node n=head;
 
       Node n1=l1;
       Node n2=l2;
        while(n1!=null && n2!=null){
            if(n1.data < n2.data){
                n.next = n1;
                n1 = n1.next;
            }else{
                n.next = n2;
            n2 = n2.next;
            }
        n=n.next;
    }
 
    if(n1!=null){
        n.next = n1;
    }
 
    if(n2!=null){
        n.next = n2;
    }
 
 
    }
}
