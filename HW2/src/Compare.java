
/**
 *
 * @author dylan
 */
public class Compare { 
    Node head;   
  
    public class Node { 
        int data; 
        Node next; 
        Node(int d) { data = d; next = null; } 
    } 

    boolean isEqual(Compare listb) { 
        Node h1 = this.head, h2 = listb.head; 
        while (h1 != null && h2 != null) 
        { 
            if (h1.data != h2.data) 
                return false; 

            h1 = h2.next; 
            h2 = h2.next; 
        } 
 
        return (h1 == null && h2 == null); 
    } 
  
    void push(int num) { 
        Node new_node = new Node(num);   
        new_node.next = head;
        head = new_node; 
    } 

    public static void main(String args[]) 
    { 
        Compare llist1 = new Compare(); 
        Compare llist2 = new Compare(); 
        
        llist1.push(5); 
        llist1.push(3); 
        llist1.push(3); 
  
        llist2.push(5); 
        llist2.push(3); 
        llist2.push(6); 
  
        if (llist1.isEqual(llist2) == true) 
            System.out.println("The lists are identical."); 
        else
            System.out.println("The lists are not identical."); 
  
    } 
} 
