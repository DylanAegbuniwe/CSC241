
package hw2;

/**
 *
 * @author dylan
 */

import java.util.*; 

public class MaxStack 
{ 

static class MyStack 
{ 
    Stack<Integer> s = new Stack<Integer>(); 
    int maxInt; 

    void max(){ 
	if (s.empty()) 
            System.out.print("The stack is empty.\n");  
	else
            System.out.print("Maximum integer in the stack is: "+maxInt + "\n"); 
	} 
	// Remove the top element from MyStack 
    void pop(){ 
	if (s.empty()) 
	{ 
            System.out.print("Stack is empty\n"); 
            return; 
	} 

	System.out.print("Top integer in the stack popped out: "); 
	int t = s.peek(); 
	s.pop(); 

	if (t > maxInt) 
	{ 
            System.out.print(maxInt + "\n"); 
            maxInt = 2 * maxInt - t; 
	} 

	else
            System.out.print(t + "\n"); 
    } 

    void push(int x){ 
        if (s.empty()) 
        { 
            maxInt = x; 
            s.push(x);  
            return; 
	} 
	if (x > maxInt) 
	{ 
            s.push(2 * x - maxInt); 
            maxInt = x; 
	} 
        else
            s.push(x);  
	} 
}; 
 
public static void main(String[] args){ 
    MyStack x = new MyStack(); 
    x.push(1); 
    x.pop(); //return 1
    x.push(2);
    x.push(3); 
    x.max(); //return 3
    x.push(4); 
    x.max();  //return 4
	} 
} 

