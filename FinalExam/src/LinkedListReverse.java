/**
 *
 * @author dylan
 */
public class LinkedListReverse{ 
    static Node head; 
  
    public static class Node{ 
        int data; 
        Node next; 
  
        Node(int d){ 
            data = d; 
            next = null; 
        } 
    } 
  
    Node reverse(Node node){ 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    void printList(Node node){ 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args){ 
        LinkedListReverse link = new LinkedListReverse(); 
        link.head = new Node(1); 
        link.head.next = new Node(2); 
        link.head.next.next = new Node(3); 
        link.head.next.next.next = new Node(4); 
        head = link.reverse(head); 
        System.out.print("Reversed linked list: "); 
        link.printList(head); 
    } 
} 