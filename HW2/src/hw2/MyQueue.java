
package hw2;

/**
 *
 * @author dylan
 */
import java.util.*; 

public class MyQueue 
{ 
    static class Queue 
    { 
	static Stack<Integer> s1 = new Stack<Integer>(); 
	static Stack<Integer> s2 = new Stack<Integer>(); 

	static void push(int x){ 

		while (!s1.isEmpty()) 
		{ 
			s2.push(s1.pop()); 
		} 
 
		s1.push(x); 

		while (!s2.isEmpty()) 
		{ 
			s1.push(s2.pop());  
		} 
	} 
 
	static int pop(){ 
            if (s1.isEmpty()) 
            { 
		System.out.println("The queue is empty."); 
		System.exit(0); 
            } 

            int x = s1.peek(); 
            s1.pop(); 
            return x; 
	}
        
        static int top(){
            int x = s1.peek();
            return x;
        }
    }


public static void main(String[] args) 
{ 
	Queue q = new Queue(); 
	q.push(1); 
        System.out.println(q.pop()); //return 1
	q.push(2); 
	q.push(3); 
        System.out.println(q.top()); //return 2
        System.out.println(q.pop()); // return 2

} 
} 

