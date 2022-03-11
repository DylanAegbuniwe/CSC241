/**
 *
 * @author dylan
 */
import java.lang.*;
public class WalkingTrajectory {
    Node head;
    
    public static class Node {
        double data;
        Node next;
        Node(double d) {data = d;}
    }
    public void push1(double num1){
        Node distance = new Node(num1);
        distance.next = head;
        head = distance;

        }
    
     public void push2(double num1){
        Node distance = new Node(num1);
        distance.next = head;
        head = distance;

        }
     public void push3(double num1){
        Node distance = new Node(num1);
        distance.next = head;
        head = distance;

        }
    
     public void push4(double num1){
        Node distance = new Node(num1);
        distance.next = head;
        head = distance;

        }
     public void push5(double num1){
        Node distance = new Node(num1);
        distance.next = head;
        head = distance;

        }
     
     public static double findMax(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
         
         double total1, total2, total3, total4, total5;
         total1 = Math.sqrt((n1*n1)+(n2*n2));
         total2 = Math.sqrt((n3*n3)+(n4*n4));
         total3 = Math.sqrt((n5*n5)+(n6*n6));
         total4 = Math.sqrt((n7*n7)+(n8*n8));
         total5 = Math.sqrt((n9*n9)+(n10*n10));
         
         if (total1 >= total2 && total1 >= total3 && total1 >= total4 && total1 >= total5)
             return total1;
         else if (total2 >= total1 && total2 >= total3 && total2 >= total2 && total2 >= total5)
             return total2;
         else if (total3 >= total1 && total3 >= total2 && total3 >= total4 && total3 >= total5)
             return total3;
         else if (total4 >= total1 && total4 >= total2 && total4 >= total3 && total4 >= total5)
             return total4;
         else
             return total5;
     }
    
        
    public static void main(String[] args){
        WalkingTrajectory llist = new WalkingTrajectory();
        llist.push1(1.1);
        llist.push1(8.7);
        llist.push2(9.1);
        llist.push2(2.3);
        llist.push3(3.0);
        llist.push3(6.4);
        llist.push4(2.2);
        llist.push4(7.8);
        llist.push5(6.7);
        llist.push5(1.6);
        System.out.println(findMax(1.1, 8.7, 9.1, 2.3, 3.0, 6.4, 2.2, 7.8, 6.7, 1.6));
        
        
    }
}
